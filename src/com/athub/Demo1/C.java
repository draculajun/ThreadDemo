package com.athub.Demo1;

public class C {

    private String lock;

    C(String lock) {
        this.lock = lock;
    }

    public void m2() {
        synchronized (lock) {
            try {
                if(Demo.flag == false){
                    lock.wait();
                }
                System.out.println("★★★★★");
                Demo.flag = false;
                lock.notifyAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
