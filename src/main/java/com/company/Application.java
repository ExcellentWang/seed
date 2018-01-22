package com.company;

import com.company.configurer.WebMvcConfigurer;
import com.company.socket.DiscardServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetSocketAddress;


@SpringBootApplication
public class Application {


    public static void main(String[] args) {
     Logger logger = LoggerFactory.getLogger(Application.class);
        SpringApplication.run(Application.class, args);
        //新开线程处理netty
        DiscardServer discardServer = new DiscardServer(10026);
        Thread thread = new Thread(discardServer);
        try {
            thread.start();
            logger.info("netty 线程起动成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//    @Autowired
//    private ChatServer chatServer;
//    @Override
//    public void run(String... args) throws Exception {
//        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 9090);
//        ChannelFuture future = chatServer.start(address);
//
//        Runtime.getRuntime().addShutdownHook(new Thread(){
//            @Override
//            public void run() {
//                chatServer.destroy();
//            }
//        });
//
//        future.channel().closeFuture().syncUninterruptibly();
//    }

