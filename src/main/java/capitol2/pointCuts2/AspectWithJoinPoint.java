package capitol2.pointCuts2;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class AspectWithJoinPoint {
    @Pointcut("execution(* *(..))")
    private void all() {}

    @Before("all()")
    public static void infoAboutMethod(JoinPoint joinPoint) {
        MethodSignature signature=(MethodSignature) joinPoint.getSignature();
        System.out.println("Full info:"+signature.getMethod());
    }
}
