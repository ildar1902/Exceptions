import driver.Driver;
import transport.Bus;
import transport.Car;
import transport.Truck;
import transport.Transport;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException{

//        ДЗ
//        Задание 1
        System.out.println("    Урок \"Исключения\". Задание 1.");
        System.out.println();
        Data d1 = new Data("ildar86", "q123456", "q123456");
        System.out.println(d1);
        System.out.println(Data.checkData(d1.getLogin(), d1.getPassword(), d1.getConfirmPassword()));
        System.out.println();
        System.out.println("    Урок \"Исключения\". Задание 2.");
        System.out.println();
        Driver driver = new Driver<>("Пётр", true, 4, "BC");
        System.out.println(driver.getCategory());
        Car allion = new Car("Toyota", "Allion", 1.8);
        Car sunny = new Car("Nissan", "Sunny", 1.6);
        Truck kamaz = new Truck("КамАЗ", "4355", 6.7);
        Truck kamaz2 = new Truck("КамАЗ", "5233", 6.0);
        Bus bus = new Bus("ПАЗ", "Вектор", 3.0);
        Bus bus2 = new Bus("ПАЗ2", "Вектор2", 3.2);
        diagnostic(allion,sunny,kamaz2,kamaz,bus,bus2);
    }

    private static void diagnostic(Transport... transports) {
        for (Transport transport : transports) {
            if (!transport.diagnostics()) {
                try {
                    throw new RuntimeException(transport.getBrand() + " "
                            + transport.getModel() + " Диагностика не пройдена");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }



}
