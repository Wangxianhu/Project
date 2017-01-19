package com.lecheng.abgame.game;

import com.lecheng.abgame.bean.Bird;
import com.lecheng.abgame.bean.Login;

public class PlayGame {
	private Login login;
	private Bird[] birds;
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Bird[] getBirds() {
		return birds;
	}
	public void setBirds(Bird[] birds) {
		this.birds = birds;
	}
	public void play(){//��ķ���
		System.out.println("************************************************************");
		System.out.println("��Ϸ��ʼ��");
		int sum=0;
		
		for (int i = 0; i < 5; i++) {
			Bird bird=birds[i];
			System.out.println(bird.getName()+"�����˵�"+(i+1)+"�ι���");
			sum+=getSumScore(bird);
		}	
		System.out.println("���ƽ����������ܷ����ǣ�"+sum);
	}
//���㹥����ĵ÷�
	public int getSumScore(Bird bird){
		//С�������
		bird.display();
		//С��Ĺ�������
		bird.attack();
		int sum=getHitValue(bird);
		if(sum>0){
			System.out.println("Boom!"+bird.getName()+"������Ұ�������Lucky");
			System.out.println("************************************************************");
		}else{
			System.out.println("˥��˥��˥��"+bird.getName()+"û�д���Ұ�������");
			System.out.println("************************************************************");
		}
		return sum;
	}
//����������
	private int getHitValue(Bird b){
		long l=Math.round(Math.random()*100);
		int birdHit=b.getHit();
		if(l>=1&&l<=birdHit){
			System.out.println("��ϲ����ϲ�������ˡ�����");
			return b.getAttack();
		}
		return 0;
	}

}
