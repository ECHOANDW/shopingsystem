package myshoping.management;

import myshoping.data.Data;

import java.util.Scanner;

public class Pay {
    /**
     * @return []
     * @Author ECHOandLANGX
     * @Description //TODO购物结算,返回获得的int积分值
     * @Date 18:53 2022/11/24
     **/
    public int shoping() {
        int shopnum[]=new int[10];//储存商品编号
        int numbers[] = new int[10];//储存购买数量
        Scanner x = new Scanner(System.in);
        levell1:for (int i = 0;;i++) {//录入商品与其数量
            System.out.println("请输入商品编号");
            shopnum[i] = (x.nextInt() - 1);
            System.out.println("请输入购买数量");
            numbers[i] = x.nextInt();
            System.out.println("按n结算,否则继续");
            while (true) {
                String cop = x.next();
                if (cop.equals("n")) {
                    break levell1;
                } else {
                    break;
                }
            }
        }
        int i = 0;
        for(;i<10;i++){
            if(shopnum[i]==0){
                break;
            }
        }
        int end = i-1;//非空的最后序列数
        Data c1 = new Data();
        c1.init();
        //输出购买列表
        System.out.println("物品\t\t\t\t\t\t单价\t\t\t个数\t\t\t金额");
        double all = 0;
        for(int j = 0;j<= end;j++){
            System.out.println(c1.goods[shopnum[j]].goodsName+"\t"+c1.goods[shopnum[j]].goodsPrice+"\t"+numbers[j]+"\t"+
                    (c1.goods[shopnum[j]].goodsPrice*numbers[j])       );
            all += (double)((double)c1.goods[shopnum[j]].goodsPrice*(double)numbers[j]);
        }
        System.out.println("折扣0.95");
        System.out.println("金额总计"+(all*0.95));
        System.out.println("实际交付"+10000);//这里或许可以接入客户端
        System.out.println("找钱"+(10000-(all*0.95)));
        int getscore = (int)all/40;
        System.out.println("本次获得的积分是"+getscore);
return getscore;
    }
}