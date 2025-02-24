package capitol1.onlyJavaWithoutXMLconf;

import capitol1.Block;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:capitol1/my.proprieties")
//@ComponentScan("capitol1.onlyJavaWithoutXMLconf") daca las asta pot lucra ca cu xml file cu java code si anotatii
class MyConf {

    @Bean
    public Block blockBean(){
        return new Piston();
    }

    @Bean
    public World worldBean(){
        return new World( blockBean());
    }

}
