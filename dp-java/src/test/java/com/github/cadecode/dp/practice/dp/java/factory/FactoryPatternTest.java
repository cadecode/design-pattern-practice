package com.github.cadecode.dp.practice.dp.java.factory;

import com.github.cadecode.dp.practice.dp.java.factory.abstractfactory.RedCircleFactory;
import org.junit.Test;

/**
 * @author Cade Li
 * @date 2022/3/2
 * @description ces
 */
public class FactoryPatternTest {

    @Test
    public void test() {
        RedCircleFactory redCircleFactory = new RedCircleFactory();
        redCircleFactory.getColor().fill();
        redCircleFactory.getShape().print();
    }

}
