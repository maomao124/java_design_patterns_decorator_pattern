package mao;

/**
 * Project name(项目名称)：java设计模式_装饰者模式
 * Package(包名): mao
 * Class(类名): Egg
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 22:31
 * Version(版本): 1.0
 * Description(描述)： 鸡蛋配料
 */

public class Egg extends Garnish
{
    public Egg(FastFood fastFood)
    {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost()
    {
        return super.getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc()
    {
        return super.getDesc() + getFastFood().getDesc();
    }
}
