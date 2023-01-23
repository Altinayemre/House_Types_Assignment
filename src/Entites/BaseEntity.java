package Entites;

public class BaseEntity {
    private int id;
    private String homeType;
    private double price;
    private int squareMeter;
    private int numberOfRoom;
    private int numberOfLounge;

    public BaseEntity() {}

    public BaseEntity(int id, String homeType, double price, int squareMeter, int numberOfRoom, int numberOfLounge) {
        this.id = id;
        this.homeType = homeType;
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRoom = numberOfRoom;
        this.numberOfLounge = numberOfLounge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfLounge() {
        return numberOfLounge;
    }

    public void setNumberOfLounge(int numberOfLounge) {
        this.numberOfLounge = numberOfLounge;
    }

    @Override
    public boolean equals(Object o) {
        BaseEntity baseEntity = (BaseEntity) o;
        return this.id == baseEntity.id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + " HOME_TYPE: " + getHomeType() + " PRICE: " + getPrice() + " SQUARE_METER: " + getSquareMeter() + " NUMBER_OF_ROOM: " + getNumberOfRoom() + " NUMBER_OF_LOUNGE: " + getNumberOfLounge();
    }
}

