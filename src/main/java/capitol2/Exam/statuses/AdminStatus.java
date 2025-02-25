package capitol2.Exam.statuses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AdminStatus extends Status {
    public AdminStatus(@Value("Admin") String name,@Value("0") int level) {
        super(name, level);
    }
}
