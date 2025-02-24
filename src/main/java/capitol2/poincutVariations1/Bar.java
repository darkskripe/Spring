package capitol2.poincutVariations1;

import org.springframework.stereotype.Component;

@Component("barBean")
public class Bar {
    public void getAlcohol() {
        System.out.println("Alcohol got");
    }

    public void getAlcohol(Alcohol alcohol) {
        System.out.println("Alcohol got "+alcohol.getName());
    }

    public void getSnack(){
        System.out.println("Snack got");
    }
}
