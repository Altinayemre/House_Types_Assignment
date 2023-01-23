package DataAccess.concretes;

import DataAccess.abstracts.BaseEntityDao;
import DataAccess.abstracts.HomeDao;
import Entites.BaseEntity;
import Entites.Home;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHomeDao implements HomeDao {
    List<BaseEntity> homeList;


    public InMemoryHomeDao() {
        homeList = new ArrayList<>();
        homeList.add(new Home(1, "homeOne", 850000, 80, 2, 2));
        homeList.add(new Home(2, "homeTwo", 1000000, 120, 3, 1));
        homeList.add(new Home(3, "homeThree", 1750000, 135, 4, 1));
    }

    // Used to hold objects
    @Override
    public List<BaseEntity> getAll() {
        return homeList;
    }

    // The listing process using the method reference
    @Override
    public List<BaseEntity> getAllList() {
        homeList.forEach(System.out::println);
        return homeList;
    }
}
