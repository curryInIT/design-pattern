package com.scu.th.dynamicproxy.jdk;

import com.scu.th.staticproxy.BasketballPlayer;
import com.scu.th.staticproxy.IPlayer;

/**
 * @Description 动态代理测试
 * @Author 18708
 * @Date 2019/3/16 16:34
 **/
public class PlayerDynamicProxyTest {

    public static void main(String[] args) {
        IPlayer player = (IPlayer) new PlayerDynamicProxy().getInstance(new BasketballPlayer());
        /*System.out.println(player.getClass());*/
        player.play();
    }
}
