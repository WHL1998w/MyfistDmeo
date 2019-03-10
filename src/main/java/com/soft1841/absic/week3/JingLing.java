package com.soft1841.absic.week3;

/**拓展练习，定义“可移动”，“可唱歌”接口，定义“精灵”类，实现接口
 * @author wanghuan le
 * 2019.03.10
 */
public class JingLing {
    public void dance(){
        System.out.println("跳舞");
    }
    public void sing(){
        System.out.println("唱歌");
    }

    public static void main(String[] args) {
        JingLing jingLing1 = new JingLing();
        System.out.println("精灵喜欢做的事：");
        jingLing1.dance();
        jingLing1.sing();
    }
}
