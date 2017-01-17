package com.lecheng.abgame.util;

import com.lecheng.abgame.bean.Player;

public class PlayerHelper {
//得到玩家数据
	public static Player getPlayerDate(){
		Player player=new Player();
		System.out.println("请输入玩家姓名：");
		player.setLoginname(InputHelper.getString());
		System.out.println("请输入玩家昵称：");
		player.setNickname(InputHelper.getString());
		System.out.println("请输入玩家密码：");
		player.setPassword(InputHelper.getString());
		System.out.println("请输入玩家性别：");
		player.setSex(InputHelper.getString());
		System.out.println("请输入玩家年龄：");
		player.setAge(InputHelper.getInt());
		return player;
	}
}
