package isp.lab9.exercise1;

import java.beans.PropertyChangeListener;
import java.util.Random;

public abstract class Sensor implements PropertyChangeListener {
    protected Random random = new Random();
}
