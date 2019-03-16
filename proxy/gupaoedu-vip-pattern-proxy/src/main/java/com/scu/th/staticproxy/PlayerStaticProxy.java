package com.scu.th.staticproxy;

/**
 * @Description 运动员静态代理类
 * @Author 18708
 * @Date 2019/3/16 16:22
 **/
public class PlayerStaticProxy implements  IPlayer{
    private IPlayer player;

    public PlayerStaticProxy(IPlayer player){
        this.player = player;
    }

    public void play() {
        before();
        player.play();
        after();
    }

    private void before() {
        System.out.println("运动开始了");
    }

    private void after() {
        System.out.println("运动结束");
    }
}
