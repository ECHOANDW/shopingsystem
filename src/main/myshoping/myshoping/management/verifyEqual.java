package myshoping.management;

import myshoping.data.Customer;
import myshoping.data.Data;
import myshoping.data.Manager;

import java.util.Scanner;

public class verifyEqual {
    Scanner x = new Scanner(System.in);

    /**
     * @return [int]
     * @Author ECHOandLANGX
     * @Description //TODO登陆界面1,登陆成功后返回1
     * @Date 20:26 2022/11/23
     **/
    public int denglu1() {

        while (true) {
            System.out.print("请输入用户名:");
            String a = x.next();
            System.out.println("请输入密码");
            String b = x.next();
            if (a.equals(new Manager().username) && b.equals(new Manager().password)) {
                System.out.println("登陆成功");
                return 1;
            } else {
                System.out.println("密码输入错误,请重新输入");
            }

        }
    }

    /**
     * @return []
     * @Author ECHOandLANGX
     * @Description //TODO登陆界面2修改管理员密码,修改部分的代码要你自己写,这个方法只帮你确认一下,返回一个string[],0是修改用户名,1[]是修改密码
     * @Date 10:39 2022/11/24
     **/
    public String[] denglu2() {
        String f[]=new String[2];
        while (true) {
            System.out.print("请输入用户名:");
            String a = x.next();
            System.out.println("请输入密码");
            String b = x.next();
            if (a.equals(new Manager().username) && b.equals(new Manager().password)) {
            }
            else{
                System.out.println("账号或密码错误,请重新输入");
                continue ;
            }
            System.out.print("请输入新的用户名:");
             f[0] = x.next();
            System.out.println("请输入新的密码");
             f[1] = x.next();
            break;
        }
        return f;
//        public static void main(String[] args) {
//            String a[] = new String[2];
//            a = new verifyEqual().denglu2();
//            System.out.println(a[0]);
//        }
    }

    /**
     * @Author ECHOandLANGX
     * @Description //TODO
     * @Date 9:41 2022/11/26
     * @return [检测目前用户信息空位的位次]
     **/
    public int bakc() {
        Data c1 = new Data();
        c1.init();
        int i = 0;
        for(; i<c1.customers.length; i++) {
            if ( c1.customers[i].custNo == 0) {
                break;
            }
        }
        return i;
    }
}