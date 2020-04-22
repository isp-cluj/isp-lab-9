package isp.lab9.exercise1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Sensor temperatureSensor = new TemperatureSensor();
        Sensor humiditySensor = new HumiditySensor();

        Controller controller = new Controller();
        controller.addPropertyChangeListener(temperatureSensor);
        controller.addPropertyChangeListener(humiditySensor);
        boolean active = false;
        while (true) {
            active = !active;
            controller.setActive(!active);
        }
    }
}
