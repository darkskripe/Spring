package capitol2.Exam;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class PointCuts {
    @Pointcut("execution(* set*(..))")
    public void allSetMethods() {
    }

    @Pointcut("execution(* get*(..))")
    public void allGetMethods() {
    }

    @Pointcut("allSetMethods() || allGetMethods()")
    public void allMethods() {}

}
