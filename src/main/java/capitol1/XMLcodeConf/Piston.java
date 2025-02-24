package capitol1.XMLcodeConf;

import capitol1.Block;

public class Piston implements Block {
    @Override
    public void action() {
     System.out.println("Push");
    }

    public Piston() {
        System.out.println("Piston constructor");
    }
}
