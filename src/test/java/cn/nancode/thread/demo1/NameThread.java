package cn.nancode.thread.demo1;


public class NameThread extends Thread {

    public NameThread() {
        super("test");
    }

    public void run() {
        System.out.println(getName());
    }
}
