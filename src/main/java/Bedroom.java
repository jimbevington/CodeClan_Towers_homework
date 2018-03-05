public class Bedroom extends Room {

    private RoomType type;
    private double price;
    private int daysBooked;

    public Bedroom(int capacity, int number, RoomType type, double price) {
        super(capacity, number);
        this.type = type;
        this.price = price;
        this.daysBooked = 0;
    }

    public RoomType getRoomType() {
        return type;
    }

    public int getDaysBooked() {
        return this.daysBooked;
    }

    public void setDaysBooked(int daysBooked) {
        this.daysBooked = daysBooked;
    }
}

