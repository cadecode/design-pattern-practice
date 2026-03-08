package com.github.cadecode.dp.practice.dp.java.pipeline;

import com.github.cadecode.dp.practice.dp.java.pipeline.context.BizContext;

/**
 * 过滤器接口
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public interface BizFilter<T extends BizContext> {

    void doFilter(T context, BizFilterChain<T> filterChain);
}
