public class Room {
    public int numBed;
    public int price;
    public boolean isOccupied;
    public boolean isDirty;

    public Room(int numBed, int price, boolean isOccupied, boolean isDirty) {
        this.numBed = numBed;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public int getPrice() {
        return price;
    }

    public int getNumBed() {
        return numBed;
    }
}
