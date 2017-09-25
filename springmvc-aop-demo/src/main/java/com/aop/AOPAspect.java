package com.aop;

import com.annotation.AOPAnnotation;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by cdn on 2017/9/14.
 */
@Aspect
@Component
public class AOPAspect {

    @AfterReturning(value = "@annotation(aopAnnotation)")
    public void doAfterReturning(AOPAnnotation aopAnnotation){
        System.out.println(aopAnnotation.methodName());
        System.out.println("after returning");
    }

}
