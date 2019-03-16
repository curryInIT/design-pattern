package com.scu.th.staticproxy;

/**
 * @Description 静态代理测试类
 * @Author 18708
 * @Date 2019/3/16 16:24
 **/
public class PlayerStaticTest {

    public static void main(String[] args) {
        IPlayer proxy = new PlayerStaticProxy(new BasketballPlayer());
        proxy.play();
    }
}
