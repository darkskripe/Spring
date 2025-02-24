package capitol2.advicesPlus3;

import org.springframework.stereotype.Component;


public class Alcohol {
    public String name;
    Double percentage;

    public Alcohol(String name, Double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Alcohol [name=" + name + ", percentage=" + percentage + "]";
    }
}
