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
		int a;
		while (true) {
			Scanner sc=new Scanner(System.in);
			try {
				a=sc.nextInt();
				break;
			} catch (Exception e) {
				System.err.println("������Ĳ������������룡");
			}
		}
			return a;
	}
}
