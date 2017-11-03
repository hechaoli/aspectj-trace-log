package com.hechaol.example.aspectj.pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class TraceLogPointcut {

    @Pointcut("execution(@com.hechaol.example.aspectj.annotation.TraceLog * *(..))")
    public void traceLog() {
    }
}
