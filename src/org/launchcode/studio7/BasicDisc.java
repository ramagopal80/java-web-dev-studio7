package org.launchcode.studio7;

public abstract class BasicDisc {

    private String name;
    private int storageCapacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public BasicDisc(String name, int storageCapacity){
        this.name = name;
        this.storageCapacity = storageCapacity;


    }
}
