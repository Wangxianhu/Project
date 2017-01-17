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
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
}
