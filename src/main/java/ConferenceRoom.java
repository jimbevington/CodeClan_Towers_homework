public class ConferenceRoom extends Room {

    private String name;
    private double price;

    public ConferenceRoom(int capacity, int number, String name, double price) {
        super(capacity, number);
        this.name = name;
        this.price = price;
    }

}
