package com.github.cadecode.dp.practice.dp.java.strategy;

import org.junit.Test;

/**
 * @author Cade Li
 * @date 2022/3/2
 * @description 测试
 */
public class StrategyPatternTest {

    @Test
    public void test() {
        PayContext context = new PayContext(new AliPay());
        context.doPay();
    }
}
