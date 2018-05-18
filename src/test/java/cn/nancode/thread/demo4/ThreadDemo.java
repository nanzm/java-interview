package cn.nancode.thread.demo4;

public class ThreadDemo {
    public static void main(String[] args) {
        /**
         * 1
         */
        new Thread() {
            public void run() {
                System.out.println("!!!");
            }
        }.start();


        /**
         * 2
         */
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("###");
            }
        };
        new Thread(r).start();

        /**
         * 3
         */
        new Thread(new Runnable() {
            public void run() {
                System.out.println("@@@");
            }
        }).start();

    }
}
