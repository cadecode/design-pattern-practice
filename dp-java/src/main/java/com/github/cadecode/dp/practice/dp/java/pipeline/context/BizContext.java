package com.github.cadecode.dp.practice.dp.java.pipeline.context;

import com.github.cadecode.dp.practice.dp.java.pipeline.enums.BizCode;
import com.github.cadecode.dp.practice.dp.java.pipeline.selector.FilterSelector;

/**
 * 上下文顶级接口
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public interface BizContext {

    BizCode getBizCode();

    FilterSelector getFilterSelector();

    boolean continueChain();
}
