package com.scu.pattern;

/**
 * 单例-双重检查锁
 */
public class DoubleCheckST {

    private static DoubleCheckST instance = null;

    private DoubleCheckST(){}

    public static DoubleCheckST getInstance(){
        if(instance == null){
            synchronized (DoubleCheckST.class){
                if(instance == null)
                    instance = new DoubleCheckST();
            }
        }

        return instance;
    }
}
