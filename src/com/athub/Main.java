package com.athub;

public class Main {

    public static void main(String[] args) {

        //生产、消费
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


