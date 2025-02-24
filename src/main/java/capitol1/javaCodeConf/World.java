package capitol1.javaCodeConf;

import capitol1.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class World {
    Block block;
    String name;
    @Value("${world.id}")
    Integer id;

    @Autowired
    public World(@Qualifier("pistonComponent") Block block) {
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

    @EventListener(ContextRefreshedEvent.class)
    private void init(){
    }
    @EventListener(ContextClosedEvent.class)
    private void destroy(){}
}
