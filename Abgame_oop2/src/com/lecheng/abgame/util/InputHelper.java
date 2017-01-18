package com.lecheng.abgame.util;

import java.util.Scanner;

public class InputHelper {
//从控制台获取字符串
	public static String getString(){
		Scanner sc=new Scanner(System.in);
		return sc.nextLine();
	}
//从控制台获取数字
	public static int getInt(){
		int a;
		while (true) {
			Scanner sc=new Scanner(System.in);
			try {
				a=sc.nextInt();
				break;
			} catch (Exception e) {
				System.err.println("您输入的不对请重新输入！");
			}
		}
			return a;
	}
}
