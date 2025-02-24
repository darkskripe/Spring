package capitol1.javaCodeConf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("capitol1/applicationContext2.xml");

        World world = (World) context.getBean("world");
        System.out.println(world.id);
        world.getBlock();


        context.close();
    }
}
