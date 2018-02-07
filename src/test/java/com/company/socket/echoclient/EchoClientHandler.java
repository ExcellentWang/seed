package com.company.socket.echoclient;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;
import org.apache.commons.lang.CharUtils;
import org.springframework.data.crossstore.ChangeSet;

/**
 * Listing 2.3 ChannelHandler for the client
 *
 * @author <a href="mailto:norman.maurer@gmail.com">Norman Maurer</a>
 */
@Sharable
public class EchoClientHandler
        extends SimpleChannelInboundHandler<ByteBuf> {
    @Override
    public void channelActive(ChannelHandlerContext ctx) {
//        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:xtpc,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:asdev,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:woty,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:wyuy,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:asoty,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:womd,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:asomd,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:asdft,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:asbltr,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:bltr,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:asxzsj,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:aspump,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:dsdl,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:scyc,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:akgapp,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:verx,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:real,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:scwt,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:yyos,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:asyyos,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:wdft,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:daij,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:kszt,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:askazt,032,OR>", CharsetUtil.UTF_8));
        ctx.writeAndFlush(Unpooled.copiedBuffer("<LDCT01201704230001:init,032,OR>", CharsetUtil.UTF_8));
    }

    @Override
    public void channelRead0(ChannelHandlerContext ctx, ByteBuf in) {
        System.out.println(
                "Client received: " + in.toString(CharsetUtil.UTF_8));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx,
                                Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
