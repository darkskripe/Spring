package capitol2.pointCuts2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class AspectOrder3 {
    @Before("capitol2.pointCuts2.MyPointCuts.allUseMethods()")
    public static void useMethods() {
        System.out.println("useMethodsAspect");
    }
}
