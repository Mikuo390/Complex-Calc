package com.yjh.complex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.yjh.complex.ui.CalcUI;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
//		CalcUI menu = CalcUI.getInstance();//获取实例
		
		//利用反射获取对象,实现懒加载
		Class<?> clazz = Class.forName("com.yjh.complex.ui.CalcUI");
		Constructor cs = clazz.getDeclaredConstructor();//获取私有构造方法
		Method setup = clazz.getDeclaredMethod("getInstance");//获取方法名称
		setup.setAccessible(true);//因为为静态方法进行爆破
		setup.invoke(cs);//执行
	}
}
