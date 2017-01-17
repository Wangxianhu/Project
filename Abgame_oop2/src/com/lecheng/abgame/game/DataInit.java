package com.lecheng.abgame.game;

import com.lecheng.abgame.bean.Bird;

public class DataInit {
	public static Bird [] birds=new Bird[3];
	static{
		//红色小鸟
		Bird b=new Bird();
		b.setId(1);
		b.setName("红色小鸟");
		b.setAttack(434);
		b.setHit(480);
		birds[0]=b;
		//蓝色小鸟
		Bird b1=new Bird();
		b1.setId(2);
		b1.setName("蓝色小鸟");
		b1.setAttack(654);
		b1.setHit(456);
		birds[1]=b1;
		//黑色小鸟
		Bird b2=new Bird();
		b2.setId(3);
		b2.setName("黑色小鸟");
		b2.setAttack(952);
		b2.setHit(269);
		birds[2]=b2;
	}
}
