package com.athub.Demo1;

public class Main {

    public static void main(String[] args) {

        //多线程 生产、消费
        String lock = new String("lock");
        P p = new P(lock);
        C c = new C(lock);
        for (int i = 0; i < 5; i++) {
            ThreadP tp = new ThreadP(p);
            tp.start();
            ThreadC tc = new ThreadC(c);
            tc.start();
        }

    }

}


