package capitol2.pointCuts2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("capitol2.pointCuts2")
@EnableAspectJAutoProxy
@PropertySource("classpath:capitol2/my.proprieties")
public class MyConf {
}
