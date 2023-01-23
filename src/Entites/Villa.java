package Entites;

public class Villa extends BaseEntity {
    public Villa() {}

    public Villa(int id, String homeType, double price, int squareMeter, int numberOfRoom, int numberOfLounge) {
        super(id, homeType, price, squareMeter, numberOfRoom, numberOfLounge);
    }
}
