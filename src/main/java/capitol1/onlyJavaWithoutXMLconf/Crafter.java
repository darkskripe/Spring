package capitol1.onlyJavaWithoutXMLconf;


import capitol1.Block;

public class Crafter implements Block {
    @Override
    public void action() {
        System.out.println("Craft");
    }

    public Crafter(){
    }
}
