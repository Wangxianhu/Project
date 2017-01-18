package com.lecheng.abgame.main;

import com.lecheng.abgame.bean.Bird;
import com.lecheng.abgame.bean.Login;
import com.lecheng.abgame.bean.Player;
import com.lecheng.abgame.game.DataInit;
import com.lecheng.abgame.game.PlayGame;
import com.lecheng.abgame.game.BlueBird;
import com.lecheng.abgame.ui.Menu;
import com.lecheng.abgame.util.InputHelper;

public class PlayerManager {
	Player[] players; 
//构造函数
	public PlayerManager(Player [] player){
		this.players=player;
	}
//检查登陆并返回Boolean
	public boolean chkLogin(Login login){
		for (Player player2 :players) {
			if (player2!=null) {
				if(login.getLoginname().equals(player2.getLoginname())&&login.getPassword().equals(player2.getPassword())){
					return true;
				}
			   }
		   }
		return false;
	}
//选择小鸟
	public Bird[] chooseBirds(){
		Bird[] birds=new Bird[5];
		Menu.showBirds();
		for (int i = 0; i < 5; i++) {
			int x=InputHelper.getInt();
			if(x==0){
				return null;
			}
			Bird b=chooseOneBird(x);
			if(b==null){
				System.out.println("没有此选项，请重新选择！");
				i--;
			}else{
				birds[i]=b;
				System.out.println("你已经选择了"+(i+1)+"只"+"你还要选择"+(4-i)+"只");
			}
		}
		return birds;
	}
//选一只鸟
	public static Bird chooseOneBird(int x){
		for (Bird b : DataInit.birds) {
			if(b.getId()==x){
				return b;
			}
		}
		return null;
	}
//玩家操作
	public void playerOp(){
			Login l=Menu.getLoginUI();
			boolean flag=this.chkLogin(l);//检查登陆并返回布尔值
			while (flag) {
				int key=Menu.getPlayerUI();
				switch (key) {//登陆成功后界面
				case 1://开始游戏
					System.out.println("开始游戏");
					boolean k=true;
					while (k) {
						Bird[] birds=chooseBirds();//选鸟并返回一个鸟组或空数组
						if(birds!=null){
							PlayGame pg=new PlayGame();
							pg.setLogin(l);
							pg.setBirds(birds);
							pg.play();
							System.out.println("是否继续游戏\tY:继续游戏\tN:退出游戏");
							if(InputHelper.getString().equalsIgnoreCase("n")){
								k=false;
							}
						}else{
							break;
						}						
					}					
					break;
				case 2://查看成绩
					System.out.println("查看成绩");
					break;
				case 0://返回上级
					flag=false;
					break;
				default:
					break;
				}
			}					
	}
}
