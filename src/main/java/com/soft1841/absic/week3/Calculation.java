package com.soft1841.absic.week3;
/**计算矩形和圆的面积
 * @author wanghuan le
 * 2019.03.10
 */
public class Calculation {
    public static void main(String[] args) {
        Shape shape = new Round();
        shape.radius = 6;
        shape.area();
        shape = new Rectangle();
        shape.high = 3;
        shape.width = 5;
        shape.area();
    }
}
