package com.lecheng.abgame.main;

import com.lecheng.abgame.bean.Login;
import com.lecheng.abgame.bean.Player;
import com.lecheng.abgame.ui.Menu;

public class Abgame {
	Player[] player=new Player[10];
	PlayerManager pm=new PlayerManager(player);
	AdminManager am=new AdminManager(player);
	
//菜单方法
	public void start(){
		int c=Menu.getMainUI();
	    switch (c) {
			case 1://玩家登陆
				pm.playerOp();
			break;
		    case 2://管理员登陆
		    	for (int i = 0; i < 3; i++) {
		    		Login l=Menu.getLoginUI();
			    	boolean flag=am.chkLogin(l);
			    	if(flag){//登陆路成功
			    		System.out.println("登陆成功");
			    		am.adminOp();
			    		break;
			    	}
			    	if (i==2) {
						System.out.println("登陆错误，你的三次机会已用完，即将返回");
						break;
					}else{
						System.out.println("登陆错误，你还有"+(2-i)+"次机会");
					}
				}
		    	//start();
			break;
		    case 0:
		    	System.out.println("退            出");
			break;

			default:
			break;
	    }
	}
//程序主入口
public static void main(String[] args) {
	Abgame ab=new Abgame();
	while (true) {
		ab.start();
	}		
	}
}
