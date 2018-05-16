package cn.nancode.thread;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t = new code();
        t.start();
        System.out.println(t.getName());


    }
}


class code extends Thread {
    @Override
    public void run() {

    }
}