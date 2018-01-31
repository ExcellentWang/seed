package com.company.socket.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;

/**
 * Listing 2.4 Main class for the client
 *
 * @author <a href="mailto:norman.maurer@gmail.com">Norman Maurer</a>
 */
public class EchoClient implements Runnable {
    private  String host;
    private  int port;


    public EchoClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void start()
        throws Exception {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
                .channel(NioSocketChannel.class)
                .remoteAddress(new InetSocketAddress(host, port))
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    public void initChannel(SocketChannel ch)
                        throws Exception {
                        ch.pipeline().addLast(
                             new EchoClientHandler());
                    }
                });
            ChannelFuture f = b.connect().sync();
            f.channel().closeFuture().sync();
        } finally {
            group.shutdownGracefully().sync();
        }
    }

//    public static void main(String[] argss)
//            throws Exception {
//        String[] args = new String[9];
//        args[0] = "localhost";
//        args[1] = "10026";
//        final String host = args[0];
//        final int port = Integer.parseInt(args[1]);
//        new EchoClient(host, port).start();
//    }

    @Override
    public void run() {
//        String[] args = new String[9];
//        args[0] = "localhost";
//        args[1] = "10026";
//        final String host = args[0];
//        final int port = Integer.parseInt(args[1]);
        try {
            new EchoClient(host, port).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

