package com.github.cadecode.dp.practice.dp.java.pipeline.business.filter;

import com.github.cadecode.dp.practice.dp.java.pipeline.AbstractBizFilter;
import com.github.cadecode.dp.practice.dp.java.pipeline.business.OrderContext;

/**
 * 保存消息的过滤器
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public class SaveOrderFilter extends AbstractBizFilter<OrderContext> {
    @Override
    public void handle(OrderContext context) {
        System.out.println("保存下单请求信息");
    }
}

