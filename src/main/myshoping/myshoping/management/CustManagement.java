package myshoping.management;

import myshoping.data.Customer;
import myshoping.data.Data;

import java.util.Scanner;

public class CustManagement {
    Scanner x = new Scanner(System.in);

    /**
     * @return []
     * @Author ECHOandLANGX
     * @Description //TODO添加会员客户,返回顺序存有3个信息的数组
     * @Date 16:29 2022/11/24
     **/
    public String[] addcus() {
        int num;
        String day = null;
        int score = 0;
        System.out.println("请输入会员号(<4位整数>)");
        int i = 1;
        do {
            num = x.nextInt();
            if (num < 1000 || num > 10000) {
                System.out.println("客户号" + num + "是无效的会员号");
                System.out.println("录入信息失败");
                i = 2;

            } else {
                System.out.println("请输入会员生日(月/日<用两位数表示>)");
                day = x.next();
                System.out.println("请输入积分");
                score = x.nextInt();
                System.out.println("已录入的会员信息是");
                System.out.println(num + "\t\t" + day + "\t\t" + score);
                break;
            }
        } while (i == 2);
        String number = String.valueOf(num);
        String scores = String.valueOf(score);
        String a[] = new String[3];
        a[0] = number;
        a[1] = day;
        a[2] = scores;
        return a;
//        CustManagement p1 = new CustManagement();
//        String a[] =  p1.addcus();
//        System.out.println(a[1]);
    }

    /**
     * @return []
     * @Author ECHOandLANGX
     * @Description //TODO修改会员信息,返回那个会员的序列号
     * @Date 18:19 2022/11/24
     **/
    public int custchange() {
        int record = 0;
        exit:
        while (true) {
            System.out.println("请输入您的目标会员的会员号");
            Data c1 = new Data();
            c1.init();
            int c = x.nextInt();
            for (int i = 0; i < c1.customers.length; i++) {
                if (c == c1.customers[i].custNo) {
                    return i;
                }
            }
            if (record == 0) {
                System.out.println("未找到您想要的会员");
            }
            System.out.println("请重新输入");
        }
    }

    /**
     * @return []
     * @Author ECHOandLANGX
     * @Description //TODOx显示当前所有的用户信息
     * @Date 8:37 2022/11/25
     **/
    public void information() {
        Data c1 = new Data();
        c1.init();
        int aaa = new verifyEqual().bakc();
        System.out.println("**************************************");
        for (int i = 0; i < aaa; i++) {
            System.out.println(i + ":" + c1.customers[i].custNo + " " + c1.customers[i].custBirth + " " +
                    c1.customers[i].custScore);
        }
        System.out.println("**************************************");
    }


}

