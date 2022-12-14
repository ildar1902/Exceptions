import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException{

//        ДЗ
//        Задание 1
        System.out.println("    Урок \"Исключения\". Задание 1.");
        System.out.println();
        Data d1 = new Data("ildar86", "q123456", "q123456");
        System.out.println(Data.checkData(d1.getLogin(), d1.getPassword(), d1.getConfirmPassword()));
    }



}
