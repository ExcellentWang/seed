package com.company.socket;

/**
 * com.company.socket
 *
 * @author Wang
 * @create 2018-01-19 下午7:15
 * @description:
 **/


import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.ReferenceCountUtil;

/**
 * Handles a server-side channel.
 */
public class DiscardServerHandler extends ChannelHandlerAdapter { // (1)
    //接收消息
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) { // (2)

        ByteBuf in = (ByteBuf) msg;
        String str = msg.toString();
        System.out.println(str);

        /*
        * ctx.write(Object) does not make the message written out to the wire.
        * It is buffered internally, and then flushed out to the wire by ctx.flush().
        * Alternatively, you could call ctx.writeAndFlush(msg) for brevity.
        * */
        //回显telnet 数据
//        ctx.writeAndFlush(msg);
        //msg 写入在打印会蹦
        try {
            while (in.isReadable()) { // (1)
                System.out.print((char) in.readByte());
                System.out.flush();
            }
        } finally {
            ReferenceCountUtil.release(msg); // (2)
        }

    }

    //发送消息
//    @Override
//    public void channelActive(final ChannelHandlerContext ctx) { // (1)
//        final ByteBuf time = ctx.alloc().buffer(4); // (2)
//        time.writeInt((int) (System.currentTimeMillis() / 1000L + 2208988800L));
//
//        final ChannelFuture f = ctx.writeAndFlush(time); // (3)
//        f.addListener((ChannelFutureListener) future -> {
//            assert f == future;
//            ctx.close();
//        }); // (4)
//    }

    //异常处理
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { // (4)
        // Close the connection when an exception is raised.
        cause.printStackTrace();
        ctx.close();
    }
}
