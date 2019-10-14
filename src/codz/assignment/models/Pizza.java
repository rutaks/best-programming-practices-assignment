package codz.assignment.models;

import codz.assignment.enums.ESize;

import java.io.Serializable;

public abstract class Pizza implements Serializable {
    private String description = "Pizza";
    private ESize size;

    public abstract int getCost();

    public ESize getSize() {
        return size;
    }

    public void setSize(ESize size) {
        this.size = size;
    }

    public String getDescription() {
        return "Size: " + getSize().label;
    }

    @Override
    public String toString() {
        return "Item: " + this.getDescription() + "\n\tTotal Price: " + this.getCost() + "Rwf";
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
