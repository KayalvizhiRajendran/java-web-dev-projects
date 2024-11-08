package org.launchcode;

public class FloppyDisc extends BaseDisc implements Disc {
    public FloppyDisc(int minRpm, int maxRpm, String storageCapacity, String type) {
        super(minRpm, maxRpm, storageCapacity, type);
    }

    @Override
    public void spinDisc() {
        System.out.println("A Floppy Disc spins at a rate of "+this.getMinRpm()+" - "+this.getMaxRpm()+"rpm.");

    }
}
