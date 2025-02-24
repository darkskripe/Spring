package capitol1.javaCodeConf;

import capitol1.Block;
import org.springframework.stereotype.Component;

@Component("pistonComponent")
public class Piston implements Block {
    @Override
    public void action() {
     System.out.println("Push");
    }

    public Piston() {
        System.out.println("Piston constructor");
    }
}
