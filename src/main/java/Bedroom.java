public class Bedroom extends Room {

    RoomType type;
    double price;

    public Bedroom(int capacity, int number, RoomType type, double price) {
        super(capacity, number);
        this.type = type;
        this.price = price;
    }

    public RoomType getRoomType() {
        return type;
    }
}
