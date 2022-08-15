package mao;

/**
 * Project name(项目名称)：java设计模式_装饰者模式
 * Package(包名): mao
 * Class(类名): FastFood
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 22:25
 * Version(版本): 1.0
 * Description(描述)： 炒面
 */

public abstract class FastFood
{
    //基础价格
    private float price;
    //描述
    private String desc;

    /**
     * Instantiates a new Fast food.
     */
    public FastFood()
    {
    }

    /**
     * Instantiates a new Fast food.
     *
     * @param price the price
     * @param desc  the desc
     */
    public FastFood(float price, String desc)
    {
        this.price = price;
        this.desc = desc;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public float getPrice()
    {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(float price)
    {
        this.price = price;
    }

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc()
    {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    /**
     * 获取价格的抽象方法
     *
     * @return 价格 float
     */
    public abstract float cost();


}
