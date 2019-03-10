package com.scu.pattern;

/**
 * 单例-饿汉式
 */
public class HungryST {

    private static final HungryST instance;

    static{
        instance = new HungryST();
    }

    private HungryST(){}

    public static final HungryST getInstance(){
        return instance;
    }
}
