public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {

        this.brand = Server.checkCondition(brand, "default");
        this.model = Server.checkCondition(brand, "default");
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
        this.engineVolume = engineVolume;
        }

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public abstract void startMove();
    public abstract void finishMove();
}
