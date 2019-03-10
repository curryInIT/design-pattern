package com.scu.pattern;

/**
 * 单例-懒汉式
 */
public class LazyST {

    private static LazyST instance = null;

    private LazyST(){}

    public synchronized static LazyST getInstance(){
        if(instance == null){
            instance = new LazyST();
        }

        return instance;
    }
}
