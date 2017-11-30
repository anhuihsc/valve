package com.hsc.study.pipeline;

import com.hsc.study.pipeline.context.PipelineContext;

/**
 * Created by apple on 17/11/29.
 */
public interface Valve {
    /**
     * Pipeline 执行上下文
     * @param pipelineContext
     */
    void invoke(final PipelineContext pipelineContext);
}
