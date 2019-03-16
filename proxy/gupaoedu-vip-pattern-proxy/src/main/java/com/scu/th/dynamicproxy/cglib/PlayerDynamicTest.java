package com.scu.th.dynamicproxy.cglib;

/**
 * @Description 动态代理测试
 * @Author 18708
 * @Date 2019/3/16 17:04
 **/
public class PlayerDynamicTest {

    public static void main(String[] args) {
        FootBallPlayer player = (FootBallPlayer) new PlayDynamicProxy().getInstance(FootBallPlayer.class);
        player.play();
    }
}
