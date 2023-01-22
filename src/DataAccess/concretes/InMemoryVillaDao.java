package DataAccess.concretes;

import DataAccess.abstracts.BaseEntityDao;
import DataAccess.abstracts.VillaDao;
import Entites.BaseEntity;
import Entites.Villa;

import java.util.ArrayList;
import java.util.List;

public class InMemoryVillaDao implements VillaDao {
    List<BaseEntity> villaList;

    public InMemoryVillaDao() {
        villaList = new ArrayList<>();
        villaList.add(new Villa(4, "villaOne", 5250000, 135, 4, 1));
        villaList.add(new Villa(5, "villaTwo", 9500000, 210, 4, 2));
        villaList.add(new Villa(6, "villaThree", 9950000, 300, 5, 2));
    }

    @Override
    public List<BaseEntity> getAll() {
        return villaList;
    }

    @Override
    public List<BaseEntity> getAllList() {
        villaList.forEach((villa) -> System.out.println(villa));
        return villaList;
    }
}
