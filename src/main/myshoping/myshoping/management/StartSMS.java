package myshoping.management;

import myshoping.data.Customer;
import myshoping.data.Data;
import myshoping.data.Manager;

import java.util.Scanner;

public class StartSMS {
    public static void main(String[] args) {
        //过程中用到的属性
        int yes = 0;//是否有账号在登录的控制,0为未登录,1为已经登录
        //用到的所有的类的实体
        Scanner x = new Scanner(System.in);
        CustManagement comt = new CustManagement();
        Customer customer = new Customer();//data的customer类
        Data data = new Data();//data的data类
        verifyEqual ver = new verifyEqual();
        Menu men = new Menu();
        Pay pa = new Pay();
        GiftManagement gift = new GiftManagement();
        Manager man = new Manager();
        System.out.println('2');
        //数据初始化
        data.init();
        //整个循环-逻辑结构树(第一菜单界面与功能的代码块)
        level2: while (true) {
            level1: while (true) {
                men.menu1();
                System.out.println("请输入");
                int pow = x.nextInt();
                switch (pow) {
                    case 1:
                        if(yes != 0){
                            System.out.println("登陆成功");
                            break level2;
                        }
                        yes = ver.denglu1();
                        break level1;
                    case 2:
                        String back[] = ver.denglu2();
                        man.username = back[0];
                        man.password = back[1];
                        System.out.println("修改成功");
                    case 3:return ;
                }
            }
        }
        while (true){
            //levell1回到主菜单
            levell1:while(true){
                men.menu2();
                System.out.println("请输入");
                int pow = x.nextInt();
                switch (pow) {

                    case 1://case1 为客户信息管理界面
                        while (true){
                            while(true){
                                men.menu3();
                                System.out.println("请输入");
                                int pow1 = x.nextInt();
                                switch (pow1) {//以下4个case是客户信息管理的4个功能
                                    case 1://功能一:查看客户信息
                                        comt.information();
                                        System.out.println("输入n返回");
                                        while(true){
                                            String cop = x.next();
                                            if (cop.equals("n")){break levell1;}
                                        }
                                    case 2://功能二:添加客户信息
                                        int temp = new verifyEqual().bakc();
                                        while(true) {
                                       String backk[] = comt.addcus();
                                            data.customers[temp].custNo = Integer.parseInt(backk[0]);
                                            data.customers[temp].custBirth = backk[1];
                                            data.customers[temp].custScore = Integer.parseInt(backk[2]);
                                            System.out.println("已添加的客户信息");
                                            System.out.println("*****************************");
                                            System.out.println(data.customers[temp].custNo+" "+data.customers[temp].custBirth
                                             +" "+data.customers[temp].custScore );
                                            System.out.println("*****************************");
                                            System.out.println("按'n'退出,不然则继续录入");

                                            while(true){
                                                String cop = x.next();
                                                if (cop.equals("n")){break levell1;}
                                                else{break;}
                                            }

                                       }
                                    case 3://功能三:修改客户信息
                                        while(true){
                                            exit1:while(true) {
                                            System.out.println("*****************************");
                                            System.out.println("1.修改会员生日");
                                            System.out.println();
                                            System.out.println("2.修改会员积分");
                                            System.out.println("*****************************");
                                            System.out.println("请选择");
                                            int cho = x.nextInt();
                                            switch (cho) {
                                                case 1://功能三子功能:修改生日
                                                    while (true) {
                                                        int who = comt.custchange();
                                                        System.out.println("*****************************");
                                                        System.out.println(data.customers[who].custNo + " " + data.customers[who].custBirth
                                                                + " " + data.customers[who].custScore);
                                                        System.out.println("请输入修改后的日期");
                                                        String bir = x.next();
                                                        data.customers[who].custBirth = bir;
                                                        System.out.println("修改成功");
                                                        System.out.println("*****************************");
                                                        System.out.println(data.customers[who].custNo + " " + data.customers[who].custBirth
                                                                + " " + data.customers[who].custScore);
                                                        System.out.println("还继续吗,输入n退出,否则继续");
                                                        while (true) {
                                                            String cop = x.next();
                                                            if (cop.equals("n")) {
                                                                break levell1;
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                case 2://功能3子功能:修改积分
                                                    while (true) {
                                                        int who = comt.custchange();
                                                        System.out.println("*****************************");
                                                        System.out.println(data.customers[who].custNo + " " + data.customers[who].custBirth
                                                                + " " + data.customers[who].custScore);
                                                        System.out.println("请输入修改后的积分");
                                                        int score = x.nextInt();
                                                        data.customers[who].custScore = score;
                                                        System.out.println("修改成功");
                                                        System.out.println("*****************************");
                                                        System.out.println(data.customers[who].custNo + " " + data.customers[who].custBirth
                                                                + " " + data.customers[who].custScore);
                                                        System.out.println("还继续吗,输入n退出,否则继续");
                                                        while (true) {
                                                            String cop = x.next();
                                                            if (cop.equals("n")) {
                                                                break levell1;
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    }
                                            }
                                        }
                                    }
                                    case 4://功能4:查看某个用户的信息
                                        while(true){
                                            int who = comt.custchange();//这里不具备退出的能力
                                            System.out.println("*****************************");
                                            System.out.println(data.customers[who].custNo + " " + data.customers[who].custBirth
                                                    + " " + data.customers[who].custScore);
                                            //按n退出语句
                                            System.out.println("还继续吗,输入n退出,否则继续");
                                            while (true) {
                                                String cop = x.next();
                                                if (cop.equals("n")) {
                                                    break levell1;
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                }
                            }
                        }

                    case 2://购物结算   -------此功能有问题,等待优化
                        while(true) {
                            men.menu4();
                            int score1 = comt.custchange();
                            int getsocre = pa.shoping();
                           data.customers[score1].custScore += getsocre;
                            System.out.println("会员信息已录入");
                            while (true) {
                                System.out.println("输入n返回");
                                String cop = x.next();
                                if (cop.equals("n")) {
                                    break levell1;
                                } else {
                                    break;
                                }
                            }
                        }
                    case 3://真情回馈
                        while(true) {
                            exits :while (true) {
                                men.menu5();
                                //是否返回上级菜单的代码
                                String cop;
                                System.out.println("请选择,输入n返回上一级菜单");
                                while (true) {
                                    cop = x.next();
                                    if (cop.equals("n")) {
                                        break levell1;
                                    } else {
                                        break;
                                    }
                                }
                                int choi = Integer.parseInt(cop);
                                //菜单分级目录
                                switch (choi) {
                                    case 1://幸运大放送
                                        while (true) {
                                            gift.luckgive();
                                            while (true) {
                                                String cop1 = x.next();
                                                if (cop1.equals("n")) {
                                                    break exits;
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                    case 2://幸运抽奖
                                        while (true) {
                                    int lucknum = (int)(Math.random()*((9999-1000)+1000));
                                    for(int i = 0;i<data.customers.length;i++){
                                        if (data.customers[i].custNo == lucknum){
                                            System.out.println("恭喜用户"+data.customers[i].custNo+"中奖,已为他送上一杯卡布奇诺~");
                                        }
                                        else{
                                            System.out.println("很遗憾,没有用户中奖");
                                            break;
                                        }
                                    }

                                            System.out.println("请选择,输入n返回上一级菜单,否则重新抽奖一次");
                                            while (true) {
                                                String cop1 = x.next();
                                                if (cop1.equals("n")) {
                                                    break exits;
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                    case 3://生日问候
                                        while (true) {
                                        gift.birthday();
                                            System.out.println("请选择,输入n返回上一级菜单,否则重新输入");
                                            while (true) {
                                                String cop1 = x.next();
                                                if (cop1.equals("n")) {
                                                    break exits;
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                }
                            }
                        }
                    case 4://注销
                        return;
                }
            }
        }
    }
}