package mao;

/**
 * Project name(项目名称)：java设计模式_装饰者模式
 * Package(包名): mao
 * Class(类名): FriedNoodles
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 22:28
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class FriedNoodles extends FastFood
{

    public FriedNoodles()
    {
        super(12, "炒面");
    }

    @Override
    public float cost()
    {
        return this.getPrice();
    }
}
