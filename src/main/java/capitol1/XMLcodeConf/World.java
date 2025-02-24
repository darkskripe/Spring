package capitol1.XMLcodeConf;

import capitol1.Block;

public class World {
   Block block;
    String name;
  //  @Value("${world.id}")
    Integer id;

    public World( Block block) {
        System.out.println("World constructor");
        this.block = block;
    }

    public void getBlock() {
        block.action();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private void init(){
    }
    private void destroy(){}
}
