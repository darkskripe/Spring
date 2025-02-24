package capitol2.pointCuts2;

import org.springframework.stereotype.Component;

@Component
public class Bar {

    public void getAlcohol() {
        System.out.println("Alcohol");
    }

    public void getSnacks() {
        System.out.println("Snacks");
    }

    public void useAlcohol() {
        System.out.println("Alcohol used");
    }

    public void useSnacks() {
        System.out.println("Snacks used");
    }
}
