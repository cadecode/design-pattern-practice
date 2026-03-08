package com.github.cadecode.dp.practice.dp.java.proxy;

/**
 * @author Cade Li
 * @date 2022/3/17
 * @description 出租人实现-房东
 */
public class Lessor implements RentOuter {
    @Override
    public void rentOut() {
        System.out.println("房东出租房屋");
    }
}
