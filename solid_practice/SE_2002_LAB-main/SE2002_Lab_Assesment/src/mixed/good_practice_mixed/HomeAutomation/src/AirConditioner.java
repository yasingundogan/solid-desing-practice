// air conditioner concrete class
public class AirConditioner implements Device {
    @Override
    public void operation() {
        turnOn();
        adjustTemperature(24);
    }

    public void turnOn() {
        System.out.println("Light is turn on....");
    }

    public void adjustTemperature(int t) {
        System.out.println("Temp set to" + t);
    }
}






