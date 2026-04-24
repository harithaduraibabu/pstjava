class ParkingSystem {
    private int bigCarSlots;
    private int mediumCarSlots;
    private int smallCarSlots;

    public ParkingSystem(int big, int medium, int small) {
        bigCarSlots = big;
        mediumCarSlots = medium;
        smallCarSlots = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && bigCarSlots != 0) {
            bigCarSlots -= 1;
            return true;
        }
        if (carType == 2 && mediumCarSlots != 0) {
            mediumCarSlots -= 1;
            return true;
        }
        if (carType == 3 && smallCarSlots != 0) {
            smallCarSlots -= 1;
            return true;
        }

        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */