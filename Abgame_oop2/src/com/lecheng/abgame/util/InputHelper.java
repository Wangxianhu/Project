package com.lecheng.abgame.util;

import java.util.Scanner;

public class InputHelper {
//�ӿ���̨��ȡ�ַ���
	public static String getString(){
		Scanner sc=new Scanner(System.in);
		return sc.nextLine();
	}
//�ӿ���̨��ȡ����
	public static int getInt(){
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
}
