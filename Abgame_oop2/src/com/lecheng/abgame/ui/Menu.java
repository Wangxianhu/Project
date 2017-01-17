package com.lecheng.abgame.ui;


import com.lecheng.abgame.bean.Bird;
import com.lecheng.abgame.bean.Login;
import com.lecheng.abgame.game.DataInit;
import com.lecheng.abgame.util.InputHelper;

public class Menu {
//���˵�
		public static int getMainUI(){
			System.out.println("************************************************************");
			System.out.println("                              ��ŭ��С��");
			System.out.println("��ѡ���¼��ʽ��1����ҵ�½   2������Ա��½   0���˳�");
			System.out.println("************************************************************");
			return InputHelper.getInt();
			}
//��ҵ�½�˵�
		public static int getPlayerUI(){
			System.out.println("************************************************************");
			System.out.println("                              ��ŭ��С��");
			System.out.println("                              1����ʼ��Ϸ");
			System.out.println("                              2���鿴�ɼ�");
			System.out.println("                              0�������ϼ�");
			System.out.println("************************************************************");
			return InputHelper.getInt();
		}
//����Ա��¼�˵�
		public static int getAdminsUI(){
			System.out.println("************************************************************");
			System.out.println("                              ϵͳ����");
			System.out.println("                            1���������");
			System.out.println("                            2���޸����");
			System.out.println("                            3��ɾ�����");
			System.out.println("                            4����ѯ���");
			System.out.println("                            5����ѯ��Ϸ");
			System.out.println("                            6������ͳ��");
			System.out.println("                            7����������");
			System.out.println("                            0����        ��");
			System.out.println("************************************************************");
			return InputHelper.getInt();
		}
//�õ���½����
		public static Login getLoginUI(){
			Login login=new Login();
			System.out.println("************************************************************");
			System.out.println("�������û�����");
			login.setLoginname(InputHelper.getString());
			System.out.println("���������룺");
			login.setPassword(InputHelper.getString());
			return login;
		}
//ѡ��С�����
		public static void showBirds(){
			System.out.println("************************************************************");
			System.out.println("\t\t��ѡ��С��");
			for (Bird bird : DataInit.birds) {
				System.out.println("ID:\t"+bird.getId()+"\t�����ɫ:\t"+bird.getName()+"\t����ֵ:\t"+bird.getAttack()+"\t������:\t"+bird.getHit()+"\t%");
			}			
			System.out.println("0�������ϼ�");
			System.out.println("��ѡ�񣨿�ѡ��ֻС���𹥻�������ͬҲ�ɲ�ͬ����");
			System.out.println("************************************************************");
		}
}