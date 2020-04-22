package isp.lab9.exercise1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private boolean active;

    private final PropertyChangeSupport support;

    public Controller() {
        this.support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setActive(boolean value) {
        support.firePropertyChange("active", this.active, value);
        this.active = value;
    }
}
