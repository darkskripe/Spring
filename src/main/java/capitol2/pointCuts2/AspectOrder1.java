package capitol2.pointCuts2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AspectOrder1 {
    @Before("capitol2.pointCuts2.MyPointCuts.allGetAndUseMethods()")
    public static void getAndUseMethods() {
        System.out.println("getAndUseMethodsAspect");
    }
}
