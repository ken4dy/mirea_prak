package prak4.Transport;
public class Train extends Transport{
    public Train(int speed, int fuel, int priceFuel, double cargoRate) {
        super(speed, fuel, priceFuel, cargoRate);
    }

    @Override
    public double getCargoRate() {
        return super.getCargoRate();
    }

    @Override
    public int getFuel() {
        return super.getFuel();
    }

    @Override
    public int getPriceFuel() {
        return super.getPriceFuel();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "Train";
    }
}
