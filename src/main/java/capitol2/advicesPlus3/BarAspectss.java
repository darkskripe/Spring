package capitol2.advicesPlus3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class BarAspectss {
    @Pointcut("execution(* get*())")
    private void getPointcut() {}

    @Before("getPointcut()")
    public void beforeAddAlcohol() {
        System.out.println("Before add alcohol");
    }

    //Schimb berea pe vodka la iesire,trebuie alt exemplu ca sa fie mai bine aplicat
    @AfterReturning(pointcut = "getPointcut()",returning ="alcohols" )
    public void returnAddAlcohol(List<Alcohol> alcohols){
        alcohols.get(0).name="Vodka";
        alcohols.forEach(alcohol -> {System.out.println(alcohol.name);});
    }

    //Pentru exceptie
    @AfterThrowing(pointcut = "execution(* checkLot(..))",throwing = "exception")
    public void afterThrowAddAlcohol(Exception exception) {
        System.out.println("After throwing checkLot has got: " + exception.getMessage());
    }

    //Nu poate avea returining sau throwing
    @After("getPointcut()")
    public void afterAddAlcohol() {
        System.out.println("After add alcohol");
    }

    //Are full control asupra la metoda
    @Around("execution(* print*(..))")
    public Object aroundPrintAlcohol(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around start");
        Object result=joinPoint.proceed();
        System.out.println("Around end");
        return result;
    }
}
