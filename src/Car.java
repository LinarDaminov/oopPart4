public class Car extends Transport implements Competing {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {

    }

    @Override
    public void finishMove() {

    }

    @Override
    public String pitStop() {

        return "Пит стоп";
    }

    @Override
    public double bestTime() {
        System.out.println();
        return 0.55;
    }



    @Override
    public double maxSpeed() {
        return 220;
    }
}
