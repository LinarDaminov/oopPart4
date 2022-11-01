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
        return null;
    }

    @Override
    public double theBestTime() {
        return 0;
    }

    @Override
    public double maxSpeed() {
        return 0;
    }
}
