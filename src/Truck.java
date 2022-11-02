public class Truck extends Transport implements Competing{
    public Truck(String brand, String model, double engineVolume) {
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
        return 1.12;
    }



    @Override
    public double maxSpeed() {
        return 175;
    }
}
