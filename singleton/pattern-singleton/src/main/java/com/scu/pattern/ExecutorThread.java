package com.scu.pattern;

public class ExecutorThread  implements Runnable{

    public void run() {
        DoubleCheckST lazyST = DoubleCheckST.getInstance();
        System.out.println(Thread.currentThread().getName() + "->" + lazyST);
    }
}
