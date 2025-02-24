package capitol2.poincutVariations1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectNotificationsWildCardsVariants {

    //Lucreaza pe oricare metoda care intra in cerinte
    @Before("execution(public void getAlcohol())")
    public void beforeNote1(){
        System.out.println("Ai venit la bar");
    }


    // * este un wildcard
    @Before("execution(public * getAlcohol())")
    public void beforeNote2(){
        System.out.println("Ai venit la bar2");
    }


    //Lucreaza pe orice get
    @Before("execution(public void get*())")
    public void beforeNote3(){
        System.out.println("Ai venit la bar3");
    }


    //Orice metoda fara parametri
    @Before("execution(* *())")
    public void beforeNote4(){
        System.out.println("Ai venit la bar4");
    }


    //O metoda anumita ditro clasa
    @Before("execution(public void capitol2.poincutVariations1.Bar.getAlcohol())")
    public void beforeNote5(){
        System.out.println("Ai venit la bar5");
    }

}
