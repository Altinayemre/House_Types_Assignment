package Entites;

public class Home extends BaseEntity {
    public Home() {}

    public Home(int id, String homeType, double price, int squareMeter, int numberOfRoom, int numberOfLounge) {
        super(id, homeType, price, squareMeter, numberOfRoom, numberOfLounge);
    }
}
