package com.panpan.designmode.singletonpattern;
/**
 * @author Jin Guopan
   @creation 2016年12月16日
       最优化构造方法
 */
public class Singleton {
	private Singleton(){};
	// 创建内部构建类
	private static class SingletonHolder{
		private static Singleton instance = new Singleton();
	}
	public static Singleton getInstance(){
		return SingletonHolder.instance;
	}
}
