package capitol2.Exam.statuses;

public abstract class Status {
    String name;
    int level;
    public Status(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "status: " + name + ", level: " + level;
    }
}
