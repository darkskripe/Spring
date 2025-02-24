package capitol2.advicesPlus3;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Bar {
    List<Alcohol> alcohols=new ArrayList<>();

    public List<Alcohol> getAlcohols() {
        addAlcohol();
        return alcohols;
    }

    private void addAlcohol(){
        Alcohol alc1=new Alcohol("beer",4.3);
        Alcohol alc2=new Alcohol("wine",18.9);
        Alcohol alc3=new Alcohol("wisky",40.3);
        this.alcohols.add(alc1);
        this.alcohols.add(alc2);
        this.alcohols.add(alc3);
    }

    public void checkLot(int lotNumber){
        System.out.println(alcohols.get(lotNumber).toString());
    }

    public String printAlcohols(int lotNumber){
        System.out.println(alcohols.get(lotNumber).toString());
        return alcohols.get(lotNumber).toString();
    }
}
