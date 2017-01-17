package com.lecheng.abgame.bean;

public class Bird {
	 int id;//鸟的id
	 String name;//鸟的名字
	 int attack;//攻击值
	 int hit;//命中率
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
}
