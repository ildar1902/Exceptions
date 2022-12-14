import java.util.Arrays;

public class Data {
    private String login;
    private String password;
    private String confirmPassword;

    public Data(String login, String password, String confirmPassword) throws WrongLoginException {
        setLogin(login);
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws WrongLoginException {
        if (login.length() > 0 && login.length() < 11) {
            this.login = login;
        } else {
            throw new WrongLoginException("Некорректно введён логин. Длина логина не может быть больше 11 символов");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public static boolean checkData(String login, String password, String confirmPassword) {
        return login.length() > 0 && login.length() < 11
                && password.length() > 0 && password.length() < 11
                && confirmPassword.length() > 0 && confirmPassword.length() < 11
                && password.equals(confirmPassword);
    }
}
