package cn.nancode.thread.demo5;

import java.util.concurrent.Callable;

public class ThreadPoolCallable implements Callable<String>{
	public String call(){
		return "abc";
	}
}
