package capitol2.poincutVariations1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);

        Bar bar = (Bar) context.getBean("barBean");

        bar.getAlcohol();
        System.out.println("\n");
        bar.getSnack();
        System.out.println("\n");
        Alcohol alcohol = context.getBean("alcohol", Alcohol.class);

        bar.getAlcohol(alcohol);

        context.close();
    }
}
