package DataAccess.concretes;

import DataAccess.abstracts.SummerHouseDao;
import Entites.BaseEntity;
import Entites.SummerHouse;

import java.util.ArrayList;
import java.util.List;

public class InMemorySummerHouseDao implements SummerHouseDao {
    List<BaseEntity> summerHouseList;

    public InMemorySummerHouseDao() {
        summerHouseList = new ArrayList<>();
        summerHouseList.add(new SummerHouse(7, "summerHouseOne", 2650000, 135, 4, 1));
        summerHouseList.add(new SummerHouse(8, "summerHouseTwo", 4500000, 180, 5, 1));
        summerHouseList.add(new SummerHouse(9, "summerHouseThree", 2250000, 120, 3, 1));
    }

    @Override
    public List<BaseEntity> getAll() {
        return summerHouseList;
    }

    @Override
    public List<BaseEntity> getAllList() {
        summerHouseList.forEach((summerHouse) -> System.out.println(summerHouse));
        return summerHouseList;
    }
}
