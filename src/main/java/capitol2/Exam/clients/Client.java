package capitol2.Exam.clients;

import capitol2.Exam.statuses.Status;

public abstract class Client {
    String login;
    String password;
    Status status;

    public Client(String login, String password, Status status) {
        this.login = login;
        this.password = password;
        this.status = status;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public Status getStatus() {
        return status;
    }

}
