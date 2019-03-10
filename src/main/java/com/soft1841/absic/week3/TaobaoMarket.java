package com.soft1841.absic.week3;

/**定义一个TaobaoMarket类。继承自Market抽象类，实现其中的shop()抽象方法
 * @author wanghuan le
 * 2019.03.10
 */
public class TaobaoMarket extends Market {
    public void shop(){
        System.out.println(name + "网购" + goods);
    }
}
