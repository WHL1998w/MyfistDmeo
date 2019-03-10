package com.soft1841.absic.week3;

/**定义一个GoShoppping类，在该类中分别使用WallMarket类和TaobaoMarket类创建抽象类的对象，
 * 并分别给抽象类中的成员变量赋不同的值，调用shop()方法分别输出结果
 * @author wanghuan le
 * 2019.03.10
 */
public class GoShopping {
    public static void main(String[] args) {
        Market market = new WallMarket();
        market.name = "沃尔玛";
        market.goods = "七匹狼西服";
        market.shop();
        market = new TaobaoMarket();
        market.name = "淘宝";
        market.goods = "韩衣都舍花裙";
        market.shop();
    }
}
