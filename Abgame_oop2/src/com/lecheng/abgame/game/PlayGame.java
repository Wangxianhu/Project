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
	public void play(){//玩的方法
		System.out.println("************************************************************");
		System.out.println("游戏开始：");
		int sum=0;
		
		for (int i = 0; i < 5; i++) {
			Bird bird=birds[i];
			System.out.println(bird.getName()+"发起了第"+(i+1)+"次攻击");
			sum+=getSumScore(bird);
		}	
		System.out.println("共计结束：您的总分数是："+sum);
	}
//计算攻击后的得分
	public int getSumScore(Bird bird){
		//小鸟的样子
		bird.display();
		//小鸟的攻击方法
		bird.attack();
		int sum=getHitValue(bird);
		if(sum>0){
			System.out.println("Boom!"+bird.getName()+"打中了野猪大王！Lucky");
			System.out.println("************************************************************");
		}else{
			System.out.println("衰！衰！衰！"+bird.getName()+"没有打中野猪大王！");
			System.out.println("************************************************************");
		}
		return sum;
	}
//计算命中率
	private int getHitValue(Bird b){
		long l=Math.round(Math.random()*100);
		int birdHit=b.getHit();
		if(l>=1&&l<=birdHit){
			System.out.println("恭喜！恭喜，命中了。。。");
			return b.getAttack();
		}
		return 0;
	}

}
