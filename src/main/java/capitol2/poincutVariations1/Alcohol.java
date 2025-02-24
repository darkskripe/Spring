package capitol2.poincutVariations1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alcohol {

    private String name;

    public Alcohol( @Value("wine")String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
