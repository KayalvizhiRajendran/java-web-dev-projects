package org.launchcode;

public class DVD extends BaseDisc implements Disc {

    public DVD(int minRpm, int maxRpm, String storageCapacity, String type) {
        super(minRpm, maxRpm, storageCapacity, type);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of "+this.getMinRpm()+"rpm -"+this.getMaxRpm()+"rpm.");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
