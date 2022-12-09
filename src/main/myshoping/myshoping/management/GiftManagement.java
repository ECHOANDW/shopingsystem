package myshoping.management;

import myshoping.data.Customer;
import myshoping.data.Data;

import java.util.Scanner;

public class GiftManagement {
    Scanner x = new Scanner(System.in);
    /**
     * @Author ECHOandLANGX
     * @Description //TODO真情回馈的表单
     * @Date 19:00 2022/11/24
     * @return []
     **/
    public void realback(){
        System.out.println("************************************************");
        System.out.println("1.幸运大放送");
        System.out.println();
        System.out.println("2.幸运抽奖");
        System.out.println();
        System.out.println("3.生日问候");
        System.out.println("************************************************");
    }
    /**
     * @Author ECHOandLANGX
     * @Description //TODO幸运大放送的功能
     * @Date 19:03 2022/11/24
     * @return []
     **/
    public void luckgive(){
        Data p1 = new Data();
        p1.init();
       int xx = new verifyEqual().bakc();
       int max = p1.customers[0].custScore;
        int i = 0;
       for(;i< xx;i++){
          if(p1.customers[i].custScore > max){
              max = p1.customers[i].custScore;
          }
       }
        System.out.println("具有最高分的会员是"+p1.customers[i].custScore+" "+p1.customers[0].custBirth+" "+p1.customers[0].custNo);
        System.out.println("已为他送上一杯卡布奇诺");
    }
    /**
     * @Author ECHOandLANGX
     * @Description //TODO生日问候的功能
     * @Date 19:31 2022/11/24
     * @return []
     **/
    public void birthday(){
        boolean isflag = false;
        Data c1 = new Data();
        c1.init();
        System.out.println("请输入今天的日期");
        String bir = x.next();
        for (int i=0;i<c1.customers.length;i++){
            if (bir.equals(c1.customers[i].custBirth)){
                System.out.println("已查找到今日过生日的客户,已发送祝福");
                isflag = true;
            }
        }
if (!isflag){
    System.out.println("今天没有过生日的会员!");
}
    }
}
