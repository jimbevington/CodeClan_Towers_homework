public class ConferenceRoom extends Room {

    private String name;
    private double price;
    private int daysBooked;

    public ConferenceRoom(int capacity, int number, String name, double price) {
        super(capacity, number);
        this.name = name;
        this.price = price;
        this.daysBooked = 0;
    }
}
