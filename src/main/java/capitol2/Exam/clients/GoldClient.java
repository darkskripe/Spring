package capitol2.Exam.clients;

import capitol2.Exam.statuses.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GoldClient extends Client{
    @Autowired
    public GoldClient(@Value("gold.login")String login, @Value("gold.password") String password, @Qualifier("goldStatus") Status status) {
        super(login, password, status);
    }

}
