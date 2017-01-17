package com.lecheng.abgame.main;

import com.lecheng.abgame.bean.Login;
import com.lecheng.abgame.bean.Player;
import com.lecheng.abgame.ui.Menu;
import com.lecheng.abgame.util.InputHelper;
import com.lecheng.abgame.util.PlayerHelper;

public class AdminManager {
	Player[] players;
	int j=0;
//构造函数
	public AdminManager(Player[] player){
		this.players=player;
	}
//检查登陆并返回Boolean
	public boolean chkLogin(Login login){
		if(login.getLoginname().equals("admin")&&login.getPassword().equals("admin")){
			return true;
		}
			return false;
	}
//新增玩家
	public void addPlayer(){
		while (true) {
			Player player= PlayerHelper.getPlayerDate();
			players[j] =player;
			j++;
			System.out.println("是否继续新增玩家：Y继续新增，N停止新增");
			String flag=InputHelper.getString();
			if (flag.equalsIgnoreCase("n")) {
				break;
			}
		}		
	}
//查询玩家信息
	public void queryPlayer(){
		for (Player player : players) {
			if (player!=null) {
				System.out.println(player.getLoginname()+"     "+player.getNickname()+"     "+player.getPassword()+"     "+player.getSex()+"     "+player.getAge());
			}
		}
	}
//管理员操作
	public void adminOp(){
		boolean flag=true;
		while (flag) {
			int i=Menu.getAdminsUI();
	        switch (i) {
			case 1://新增玩家
				addPlayer();
				break;
			case 2://修改玩家
				
				break;
			case 3://删除玩家
					
				break;
			case 4://查询玩家
				queryPlayer();
				break;
			case 5://查询游戏
							
				break;
			case 6://分数统计
								
				break;
			case 7://参数设置
								
				break;
			case 0://返回
				flag=false;						
				break;
			default:
				break;
			}
		}        
	}
}
