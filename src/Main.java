import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws WrongLoginException{

//        ДЗ
//        Задание 1
        System.out.println("    Урок \"Исключения\". Задание 1.");
        System.out.println();
        Data d1 = new Data("ildar", "q123456e", "q123456e");
        Data d2 = new Data("ildar", "q123e", "q123e");
        Data d3 = new Data("ildar", "q123e", "q1234e");
        System.out.println( Data.checkData(d1.getLogin(), d1.getPassword(), d1.getConfirmPassword()));
        System.out.println( Data.checkData(d2.getLogin(), d2.getPassword(), d2.getConfirmPassword()));
        System.out.println( Data.checkData(d3.getLogin(), d3.getPassword(), d3.getConfirmPassword()));
        checkData2(d1.getLogin(), d1.getPassword(), d1.getConfirmPassword());
        checkData2(d2.getLogin(), d2.getPassword(), d2.getConfirmPassword());
//        checkData2(d3.getLogin(), d3.getPassword(), d3.getConfirmPassword());
        System.out.println(checkData2(d2.getLogin(), d2.getPassword(), d2.getConfirmPassword()));
//        System.out.println(checkData2(d3.getLogin(), d3.getPassword(), d3.getConfirmPassword()));
    }

    public static boolean checkData2(String login, String password, String confirmPassword) throws WrongLoginException {
        if (!Data.checkData(login, password, confirmPassword)) {
            throw new WrongLoginException("Введены некорректные данные");
        } else {
            return Data.checkData(login, password, confirmPassword);
        }
    }

}
