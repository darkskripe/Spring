package capitol1.javaCodeConf;

import capitol1.Block;
import org.springframework.stereotype.Component;

@Component("crafterComponent")
public class Crafter implements Block {
    @Override
    public void action() {
        System.out.println("Craft");
    }

    public Crafter(){
    }
}
