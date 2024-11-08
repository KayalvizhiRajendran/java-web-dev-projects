package org.launchcode;

public abstract class BaseDisc {
    private int minRpm;
    private int maxRpm;
    private String storageCapacity;
    private String type;

    public BaseDisc(int minRpm, int maxRpm, String storageCapacity, String type) {
        this.minRpm = minRpm;
        this.maxRpm = maxRpm;
        this.storageCapacity = storageCapacity;
        this.type = type;
    }

    public int getMinRpm() {
        return minRpm;
    }

    public void setMinRpm(int minRpm) {
        this.minRpm = minRpm;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
