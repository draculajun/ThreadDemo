package com.athub.Demo1;

public class ThreadP extends Thread{

    private P p;

    public ThreadP(P p){
        this.p = p;
    }

    @Override
    public void run() {
        p.m1();
    }

}
