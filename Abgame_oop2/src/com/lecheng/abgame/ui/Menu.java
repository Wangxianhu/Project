package com.lecheng.abgame.ui;


import com.lecheng.abgame.bean.Bird;
import com.lecheng.abgame.bean.Login;
import com.lecheng.abgame.game.DataInit;
import com.lecheng.abgame.util.InputHelper;

public class Menu {
//主菜单
		public static int getMainUI(){
			System.out.println("************************************************************");
			System.out.println("                              愤怒的小鸟");
			System.out.println("请选择登录方式：1、玩家登陆   2、管理员登陆   0、退出");
			System.out.println("************************************************************");
			return InputHelper.getInt();
			}
//玩家登陆菜单
		public static int getPlayerUI(){
			System.out.println("************************************************************");
			System.out.println("                              愤怒的小鸟");
			System.out.println("                              1、开始游戏");
			System.out.println("                              2、查看成绩");
			System.out.println("                              0、返回上级");
			System.out.println("************************************************************");
			return InputHelper.getInt();
		}
//管理员登录菜单
		public static int getAdminsUI(){
			System.out.println("************************************************************");
			System.out.println("                              系统管理");
			System.out.println("                            1、新增玩家");
			System.out.println("                            2、修改玩家");
			System.out.println("                            3、删除玩家");
			System.out.println("                            4、查询玩家");
			System.out.println("                            5、查询游戏");
			System.out.println("                            6、分数统计");
			System.out.println("                            7、参数设置");
			System.out.println("                            0、返        回");
			System.out.println("************************************************************");
			return InputHelper.getInt();
		}
//得到登陆界面
		public static Login getLoginUI(){
			Login login=new Login();
			System.out.println("************************************************************");
			System.out.println("请输入用户名：");
			login.setLoginname(InputHelper.getString());
			System.out.println("请输入密码：");
			login.setPassword(InputHelper.getString());
			return login;
		}
//选择小鸟界面
		public static void showBirds(){
			System.out.println("************************************************************");
			System.out.println("\t\t请选择小鸟");
			for (Bird bird : DataInit.birds) {
				System.out.println("ID:\t"+bird.getId()+"\t鸟的颜色:\t"+bird.getName()+"\t攻击值:\t"+bird.getAttack()+"\t命中率:\t"+bird.getHit()+"\t%");
			}			
			System.out.println("0、返回上级");
			System.out.println("请选择（可选五只小鸟发起攻击，可相同也可不同）！");
			System.out.println("************************************************************");
		}
}