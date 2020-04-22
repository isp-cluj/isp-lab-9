package isp.lab9.exercise1;

import java.beans.PropertyChangeEvent;

public class HumiditySensor extends Sensor {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ((boolean) evt.getNewValue()) {
            System.out.println("Humidity sensor value: " + this.random.nextInt(100));
        } else {
            System.out.println("Sensor is disabled");
        }
    }
}
