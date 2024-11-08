package org.launchcode;

public class CD extends BaseDisc implements Disc {
    public CD(int minRpm, int maxRpm, String storageCapacity, String type) {
        super(minRpm, maxRpm, storageCapacity, type);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of "+this.getMinRpm()+" - "+this.getMaxRpm()+"rpm.");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
