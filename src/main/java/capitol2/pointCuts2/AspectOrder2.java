package capitol2.pointCuts2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AspectOrder2 {

    @Before("capitol2.pointCuts2.MyPointCuts.allGetMethods()")
    public static void getMethods() {
        System.out.println("getMethodsAspect");
    }
}
