package capitol2.Exam;

import capitol2.Exam.statuses.GoldStatus;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspects {
    @Pointcut("execution(* get*(..))")
    public void allGetMethods() {
    }


    @Around("allGetMethods()")
    public Object allStringMethods(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(joinPoint.getSignature());
        Object join_Point = joinPoint.proceed();
        if (join_Point instanceof capitol2.Exam.statuses.Status) {
            System.out.println(joinPoint.getSignature());
            return new GoldStatus();
        }
        System.out.println(joinPoint.getSignature());
        return join_Point;
    }


}
