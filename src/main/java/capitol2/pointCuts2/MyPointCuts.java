package capitol2.pointCuts2;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* get*())")
    protected void allGetMethods() {}

    @Pointcut("execution(* use*())")
    protected void allUseMethods() {}

    @Pointcut("allGetMethods() || allUseMethods()")
    protected void allGetAndUseMethods() {}

}
