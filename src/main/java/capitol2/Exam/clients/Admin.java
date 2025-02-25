package capitol2.Exam.clients;

import capitol2.Exam.statuses.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Admin extends Client {

    @Autowired
    public Admin(@Value("admin.login") String login, @Value("admin.password") String password,@Qualifier("adminStatus") Status status) {
        super(login, password,status);
    }

    @EventListener(ContextRefreshedEvent.class)
    public void init(){
        System.out.println("Admin loged in");
    }

    @EventListener(ContextClosedEvent.class)
    public void close(){
        System.out.println("Admin logged out");
    }

}
