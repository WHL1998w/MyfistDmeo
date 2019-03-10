package com.soft1841.absic.week3;

public class Round extends Shape {
    @Override
    public void area() {
        System.out.println("圆形面积是：" + radius*radius*3.14);
    }
}
