package mao;

/**
 * Project name(项目名称)：java设计模式_装饰者模式
 * Package(包名): mao
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 22:38
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        {
            //炒饭
            FastFood fastFood = new FriedRice();
            //花费的价格
            System.out.println(fastFood.getDesc() + "：" + fastFood.cost() + "元");
            //加鸡蛋
            fastFood = new Egg(fastFood);
            //花费的价格
            System.out.println(fastFood.getDesc() + "：" + fastFood.cost() + "元");
            //加培根
            fastFood = new Bacon(fastFood);
            //花费的价格
            System.out.println(fastFood.getDesc() + "：" + fastFood.cost() + "元");
            //再加鸡蛋
            fastFood = new Egg(fastFood);
            //花费的价格
            System.out.println(fastFood.getDesc() + "：" + fastFood.cost() + "元");
        }
        System.out.println("----------------");
        {
            //炒面
            FastFood fastFood = new FriedNoodles();
            //花费的价格
            System.out.println(fastFood.getDesc() + "：" + fastFood.cost() + "元");
            //加鸡蛋
            fastFood = new Egg(fastFood);
            //花费的价格
            System.out.println(fastFood.getDesc() + "：" + fastFood.cost() + "元");
            //加培根
            fastFood = new Bacon(fastFood);
            //花费的价格
            System.out.println(fastFood.getDesc() + "：" + fastFood.cost() + "元");
            //再加鸡蛋
            fastFood = new Egg(fastFood);
            //花费的价格
            System.out.println(fastFood.getDesc() + "：" + fastFood.cost() + "元");
            //加培根
            fastFood = new Bacon(fastFood);
            //花费的价格
            System.out.println(fastFood.getDesc() + "：" + fastFood.cost() + "元");
        }
    }
}
