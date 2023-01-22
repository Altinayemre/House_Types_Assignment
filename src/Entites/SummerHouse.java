package Entites;

public class SummerHouse extends BaseEntity {
    public SummerHouse() {
    }

    public SummerHouse(int id, String homeType, double price, int squareMeter, int numberOfRoom, int numberOfLounge) {
        super(id, homeType, price, squareMeter, numberOfRoom, numberOfLounge);
    }
}
