package capitol1.XMLcodeConf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("capitol1/applicationContext.xml");
        World world = (World) context.getBean("world1");

        world.block.action();
        System.out.println("id:"+world.id);
        System.out.println("name:"+world.name);
        context.close();
    }
}
