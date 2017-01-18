package com.lecheng.abgame.game;

import com.lecheng.abgame.bean.Bird;

public class DataInit {
	public static Bird [] birds=new Bird[3];
	static{
		//红色小鸟
		Bird b=new RedBird();//上溯造型//
		b.setId(1);
		b.setName("红色小鸟");
		b.setAttack(200);
		b.setHit(80);
		birds[0]=b;
		//蓝色小鸟
		Bird b1=new BlueBird();
		b1.setId(2);
		b1.setName("蓝色小鸟");
		b1.setAttack(300);
		b1.setHit(50);
		birds[1]=b1;
		//黑色小鸟
		Bird b2=new BlackBird();
		b2.setId(3);
		b2.setName("黑色小鸟");
		b2.setAttack(500);
		b2.setHit(30);
		birds[2]=b2;
	}
}
