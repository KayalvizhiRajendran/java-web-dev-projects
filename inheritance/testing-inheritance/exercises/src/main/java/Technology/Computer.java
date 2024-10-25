package technology;

public class Computer {
    private String serialNumber;
    private String modelNumber;
    private String osVersion;

    public Computer(String serialNumber, String modelNumber, String osVersion){
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.osVersion = osVersion;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getOsVersion() {
        return osVersion;
    }
}
