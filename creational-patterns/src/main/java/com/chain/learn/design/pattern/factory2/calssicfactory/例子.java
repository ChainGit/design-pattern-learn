package com.chain.learn.design.pattern.factory2.calssicfactory;

/**
 * @Author bangquan.qian
 * @Date 2019-01-19 18:10
 */

public class 例子 {

    public static void main(String[] args) {
        m1();
    }

    private static void m1() {

        计算机工厂 戴尔 = new 戴尔计算机工厂();

        计算机 服务器 = 戴尔.生产(计算机图纸.服务器);
        服务器.描述();

        计算机 台式机 = 戴尔.生产(计算机图纸.台式机);
        台式机.描述();

        计算机 笔记本 = 戴尔.生产(计算机图纸.笔记本);
        笔记本.描述();
    }
}
