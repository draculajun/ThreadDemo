package com.athub.Demo1;

public class P {

    private String lock;

    P(String lock) {
        this.lock = lock;
    }

    public void m1() {
        synchronized (lock){
            try {
                if(Demo.flag == true){
                    lock.wait();
                }
                System.out.println("☆☆☆☆☆");
                Demo.flag = true;
                lock.notifyAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
