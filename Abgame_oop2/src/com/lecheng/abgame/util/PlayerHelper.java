package com.lecheng.abgame.util;

import com.lecheng.abgame.bean.Player;

public class PlayerHelper {
//�õ��������
	public static Player getPlayerDate(){
		Player player=new Player();
		System.out.println("���������������");
		player.setLoginname(InputHelper.getString());
		System.out.println("����������ǳƣ�");
		player.setNickname(InputHelper.getString());
		System.out.println("������������룺");
		player.setPassword(InputHelper.getString());
		System.out.println("����������Ա�");
		player.setSex(InputHelper.getString());
		System.out.println("������������䣺");
		player.setAge(InputHelper.getInt());
		return player;
	}
}
