package capitol2.Exam;

import capitol2.Exam.clients.Admin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Admin admin = context.getBean( "admin",Admin.class);

        System.out.println(admin.getStatus().toString());

        context.close();
    }
}
