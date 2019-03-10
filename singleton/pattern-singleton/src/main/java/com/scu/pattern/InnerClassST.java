package com.scu.pattern;

/**
 * 单例-静态内部类
 */
public class InnerClassST {

    /**
     * 防止反射破坏单例
     */
    private InnerClassST(){
        if(InnerClass.instance != null){
            throw new RuntimeException("不允许创建多个实例！");
        }
    }

    public static final InnerClassST getInstance(){
        return InnerClass.instance;
    }

    private static class InnerClass{
        private static final InnerClassST instance = new InnerClassST();
    }
}
