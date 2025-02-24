package capitol2.poincutVariations1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectNotificationsParameters {

    //Oricare tip de parametru,doar unul
    @Before("execution(public void getAlcohol(*))")
    public void beforeNote6(){
        System.out.println("Ai venit la bar6");
    }


    //Oricare tip de parametri oriciti
    @Before("execution(public void getAlcohol(..))")
    public void beforeNote7(){
        System.out.println("Ai venit la bar7");
    }


    //Tip anumit de parametru
    @Before("execution(public void getAlcohol(capitol2.poincutVariations1.Alcohol))")
    public void beforeNote8(){
        System.out.println("Ai venit la bar8");
    }
}
