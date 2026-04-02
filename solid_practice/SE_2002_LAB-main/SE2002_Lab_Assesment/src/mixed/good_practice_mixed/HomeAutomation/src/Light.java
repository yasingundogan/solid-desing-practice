// light concrete class
public class Light implements Device
{
    @Override
    public void operation() {
        turnOn();
    }

    public void turnOn(){
        System.out.println("Light is turn on....");
    }




}