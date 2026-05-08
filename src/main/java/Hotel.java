public class Hotel {
    private String name;
    private int numOfSuites;
    private int numOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numOfSuites, int numOfRooms) {
        this.name = name;
        this.numOfSuites = numOfSuites;
        this.numOfRooms = numOfRooms;
    }
    public Hotel(String name, int numOfSuites, int numOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numOfSuites = numOfSuites;
        this.numOfRooms = numOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSuites() {
        return numOfSuites;
    }

    public void setNumOfSuites(int numOfSuites) {
        this.numOfSuites = numOfSuites;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public void setBookedSuites(int bookedSuites) {
        this.bookedSuites = bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public void setBookedBasicRooms(int bookedBasicRooms) {
        this.bookedBasicRooms = bookedBasicRooms;
    }
}
