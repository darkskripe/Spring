package capitol2.advicesPlus3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Bar bar = (Bar) context.getBean("bar");

        bar.getAlcohols();

        //Pentru a vedea aspectul cu exceptie
        try{
            bar.checkLot(3);
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }

        System.out.println("Method has been done "+bar.printAlcohols(1));

        context.close();
    }
}
