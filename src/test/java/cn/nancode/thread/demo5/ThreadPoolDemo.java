package cn.nancode.thread.demo5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadPoolDemo {
	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(2);

		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
	
	}
}
