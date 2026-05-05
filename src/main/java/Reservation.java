public class Reservation {
    public String roomType;
    public double price;
    public int numOfNights;
    public boolean isWeekend;

    public Reservation(boolean isWeekend, int numOfNights, double price, String roomType) {
        this.isWeekend = isWeekend;
        this.numOfNights = numOfNights;
        this.price = price;
        this.roomType = roomType;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public double getPrice() {
        double price=0;
        if(roomType.equalsIgnoreCase("King")) {
            price = 139.00;
        } else if(roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public double getReservationTotal(){
      double price = getPrice();
      if(isWeekend) {
          price = price * 1.1;
      }
      return price;
    }
}
