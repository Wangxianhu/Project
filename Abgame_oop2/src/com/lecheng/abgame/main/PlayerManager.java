package com.lecheng.abgame.main;

import com.lecheng.abgame.bean.Bird;
import com.lecheng.abgame.bean.Login;
import com.lecheng.abgame.bean.Player;
import com.lecheng.abgame.game.DataInit;
import com.lecheng.abgame.ui.Menu;
import com.lecheng.abgame.util.InputHelper;

public class PlayerManager {
	Player[] players; 
//���캯��
	public PlayerManager(Player [] player){
		this.players=player;
	}
//����½������Boolean
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
//ѡ��С��
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
				System.out.println("û�д�ѡ�������ѡ��");
				i--;
			}else{
				birds[i]=b;
				System.out.println("���Ѿ�ѡ����"+(i+1)+"ֻ"+"�㻹Ҫѡ��"+(4-i)+"ֻ");
			}
		}
		return birds;
	}
//ѡһֻ��
	public static Bird chooseOneBird(int x){
		for (Bird b : DataInit.birds) {
			if(b.getId()==x){
				return b;
			}
		}
		return null;
	}
//��Ҳ���
	public void playerOp(){
			Login l=Menu.getLoginUI();
//			for (Player player2 : player) {
//				System.out.println(player2);
//			}
			boolean flag=this.chkLogin(l);//����½�����ز���ֵ
			if(flag) {//��½�ɹ�����
				int key=Menu.getPlayerUI();
				switch (key) {
				case 1://��ʼ��Ϸ
					System.out.println("��ʼ��Ϸ");
					chooseBirds();
					break;
				case 2://�鿴�ɼ�
					System.out.println("�鿴�ɼ�");
					break;
				case 0://�����ϼ�
					break;
				default:
					break;
				}
			}			
	}
}