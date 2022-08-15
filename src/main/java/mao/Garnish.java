package mao;

/**
 * Project name(项目名称)：java设计模式_装饰者模式
 * Package(包名): mao
 * Class(类名): Garnish
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 22:29
 * Version(版本): 1.0
 * Description(描述)： 配料类
 */

public abstract class Garnish extends FastFood
{
    private FastFood fastFood;

    /**
     * Gets fast food.
     *
     * @return the fast food
     */
    public FastFood getFastFood()
    {
        return fastFood;
    }

    /**
     * Sets fast food.
     *
     * @param fastFood the fast food
     */
    public void setFastFood(FastFood fastFood)
    {
        this.fastFood = fastFood;
    }

    /**
     * Instantiates a new Garnish.
     *
     * @param price    the price
     * @param desc     the desc
     * @param fastFood the fast food
     */
    public Garnish(float price, String desc, FastFood fastFood)
    {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
