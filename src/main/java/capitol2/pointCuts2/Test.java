package capitol2.pointCuts2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);

        Bar bar = (Bar) context.getBean("bar");

        bar.getAlcohol();

    }
}
