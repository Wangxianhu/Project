package com.lecheng.abgame.bean;

public abstract class Bird {
//��ĳ��󡢷�װ��
	int id;//���id
	String name;//�������
	int attack;//����ֵ
	int hit;//������
//���������
	public abstract void display();
//��Ĺ�����
	public abstract void attack();
//get��set����
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
