package mao;

/**
 * Project name(项目名称)：java设计模式_装饰者模式
 * Package(包名): mao
 * Class(类名): Bacon
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 22:35
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Bacon extends Garnish
{

    public Bacon(FastFood fastFood)
    {
        super(2, "培根", fastFood);
    }

    @Override
    public float cost()
    {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc()
    {
        return super.getDesc() + getFastFood().getDesc();
    }
}
