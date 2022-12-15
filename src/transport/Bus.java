package transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автобус \"" + getBrand() + "\" начал движение!");
    }

    @Override
    public void stop() {
        System.out.println("Автобус \"" + getBrand() + "\" остановился");
    }

    @Override
    public boolean diagnostics() {
        System.out.println("Автобусу " + getBrand() + " " + getModel() + " диагностика не требуется");
        return true;
    }


    @Override
    public void pitStop() {
        System.out.println("Автобус \"" + getBrand() + "\" заехал на пит-стоп!");
        System.out.println("Автобус \"" + getBrand() + "\" продолжил движение!");
    }

    @Override
    public int bestLapTime() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(5) + 14;
    }

    @Override
    public int maxSpeed() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(50) + 70;
    }
}
