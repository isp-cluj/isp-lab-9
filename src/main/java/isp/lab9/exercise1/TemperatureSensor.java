package isp.lab9.exercise1;

import java.beans.PropertyChangeEvent;

public class TemperatureSensor extends Sensor {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ((boolean) evt.getNewValue()) {
            System.out.println("Temperature sensor value: " + this.random.nextInt(100));
        } else {
            System.out.println("Sensor is disabled");
        }
    }
}
