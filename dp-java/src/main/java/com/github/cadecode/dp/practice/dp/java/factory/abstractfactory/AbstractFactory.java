package com.github.cadecode.dp.practice.dp.java.factory.abstractfactory;

import com.github.cadecode.dp.practice.dp.java.factory.color.Color;
import com.github.cadecode.dp.practice.dp.java.factory.shape.Shape;

/**
 * @author cade li
 * @date 2022/3/1
 * @description 抽象工厂
 */
public abstract class AbstractFactory {

    public abstract Shape getShape();

    public abstract Color getColor();
}
