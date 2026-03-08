package com.github.cadecode.dp.practice.dp.java.pipeline.business.filter;

import com.github.cadecode.dp.practice.dp.java.pipeline.AbstractBizFilter;
import com.github.cadecode.dp.practice.dp.java.pipeline.business.OrderContext;

/**
 * 拉取付款方式
 *
 * @author Cade Li
 * @since 2023/6/21
 */
public class UserPayWayFilter extends AbstractBizFilter<OrderContext> {
    @Override
    public void handle(OrderContext context) {
        System.out.println("拉取用户付款方式信息");
    }
}
