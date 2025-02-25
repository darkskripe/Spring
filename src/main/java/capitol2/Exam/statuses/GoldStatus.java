package capitol2.Exam.statuses;

import org.springframework.stereotype.Component;

@Component
public class GoldStatus extends Status {
    public GoldStatus() {
        super("Gold", 1);
    }
}
