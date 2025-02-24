package capitol1.onlyJavaWithoutXMLconf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);

        World world=(World) context.getBean("worldBean");
        world.block.action();
        System.out.println(world.id);
        context.close();
    }
}
