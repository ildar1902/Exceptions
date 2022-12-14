import java.util.Arrays;

public class Data {
    private String login;
    private String password;
    private String confirmPassword;

    public Data(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        setLogin(login);
        setPassword(password);
        setConfirmPassword(confirmPassword);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws WrongLoginException {
        if (login != null && login.matches("[a-z0-9_A-Z]+")
                && login.length() > 0 && login.length() < 21) {
            this.login = login;
        } else {
            throw new WrongLoginException("Некорректно введён логин");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws WrongPasswordException {
        if (password != null && password.matches("[a-z0-9_A-Z]+")
                && password.length() > 0 && password.length() < 21) {
            this.password = password;
        } else {
            throw new WrongPasswordException("Некорректно введён пароль");
        }
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) throws WrongPasswordException {
        if (confirmPassword != null && confirmPassword.matches("[a-z0-9_A-Z]+")
                && confirmPassword.length() > 0 && confirmPassword.length() < 21) {
            this.confirmPassword = confirmPassword;
        } else {
            throw new WrongPasswordException("Подтверждение пароля введено некорректно");
        }
    }

    public static boolean checkData(String login,
                                    String password,
                                    String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        boolean result = true;
        result = result && login != null && login.matches("[a-z0-9_A-Z]+")
                && login.length() > 0 && login.length() < 21
                && password != null && password.matches("[a-z0-9_A-Z]+")
                && password.length() > 0 && password.length() < 21
                && confirmPassword != null && confirmPassword.matches("[a-z0-9_A-Z]+")
                && confirmPassword.length() > 0 && confirmPassword.length() < 21
                && password.equals(confirmPassword);
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
        return result;
    }
}
