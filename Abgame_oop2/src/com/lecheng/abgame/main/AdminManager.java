package com.lecheng.abgame.main;

import com.lecheng.abgame.bean.Login;
import com.lecheng.abgame.bean.Player;
import com.lecheng.abgame.ui.Menu;
import com.lecheng.abgame.util.InputHelper;
import com.lecheng.abgame.util.PlayerHelper;

public class AdminManager {
	Player[] players;
	int j=0;
//���캯��
	public AdminManager(Player[] player){
		this.players=player;
	}
//����½������Boolean
	public boolean chkLogin(Login login){
		if(login.getLoginname().equals("admin")&&login.getPassword().equals("admin")){
			return true;
		}
			return false;
	}
//�������
	public void addPlayer(){
		while (true) {
			Player player= PlayerHelper.getPlayerDate();
			players[j] =player;
			j++;
			System.out.println("�Ƿ����������ң�Y����������Nֹͣ����");
			String flag=InputHelper.getString();
			if (flag.equalsIgnoreCase("n")) {
				break;
			}
		}		
	}
//��ѯ�����Ϣ
	public void queryPlayer(){
		for (Player player : players) {
			if (player!=null) {
				System.out.println(player.getLoginname()+"     "+player.getNickname()+"     "+player.getPassword()+"     "+player.getSex()+"     "+player.getAge());
			}
		}
	}
//����Ա����
	public void adminOp(){
		boolean flag=true;
		while (flag) {
			int i=Menu.getAdminsUI();
	        switch (i) {
			case 1://�������
				addPlayer();
				break;
			case 2://�޸����
				
				break;
			case 3://ɾ�����
					
				break;
			case 4://��ѯ���
				queryPlayer();
				break;
			case 5://��ѯ��Ϸ
							
				break;
			case 6://����ͳ��
								
				break;
			case 7://��������
								
				break;
			case 0://����
				flag=false;						
				break;
			default:
				break;
			}
		}        
	}
}
