package com.lecheng.abgame.main;

import com.lecheng.abgame.bean.Login;
import com.lecheng.abgame.bean.Player;
import com.lecheng.abgame.ui.Menu;

public class Abgame {
	Player[] player=new Player[10];
	PlayerManager pm=new PlayerManager(player);
	AdminManager am=new AdminManager(player);
	
//�˵�����
	public void start(){
		int c=Menu.getMainUI();
	    switch (c) {
			case 1://��ҵ�½
				pm.playerOp();
			break;
		    case 2://����Ա��½
		    	for (int i = 0; i < 3; i++) {
		    		Login l=Menu.getLoginUI();
			    	boolean flag=am.chkLogin(l);
			    	if(flag){//��½·�ɹ�
			    		System.out.println("��½�ɹ�");
			    		am.adminOp();
			    		break;
			    	}
			    	if (i==2) {
						System.out.println("��½����������λ��������꣬��������");
						break;
					}else{
						System.out.println("��½�����㻹��"+(2-i)+"�λ���");
					}
				}
		    	//start();
			break;
		    case 0:
		    	System.out.println("��            ��");
			break;

			default:
			break;
	    }
	}
//���������
public static void main(String[] args) {
	Abgame ab=new Abgame();
	while (true) {
		ab.start();
	}		
	}
}
