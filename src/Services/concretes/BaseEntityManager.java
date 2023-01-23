package Services.concretes;

import DataAccess.abstracts.BaseEntityDao;
import Entites.BaseEntity;
import Services.abstracts.BaseEntityService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BaseEntityManager implements BaseEntityService {
    BaseEntityDao baseEntityDao;

    List<BaseEntityDao> baseEntityDaoList;

    public BaseEntityManager() {
    }

    public BaseEntityManager(List<BaseEntityDao> baseEntityDaoList) {
        this.baseEntityDaoList = baseEntityDaoList;
    }

    public BaseEntityManager(BaseEntityDao baseEntityDao) {
        this.baseEntityDao = baseEntityDao;
    }

    // The process of listing all existing objects of the specified type
    @Override
    public List<BaseEntity> getAllList() {
        return this.baseEntityDao.getAllList();
    }

    // Method that returns total prices
    @Override
    public long totalPrice() {
        double totalPrice = 0;
        for (BaseEntity home : baseEntityDao.getAll()) {
            totalPrice += home.getPrice();
        }
        return (long) totalPrice;
    }

    // Method that returns total prices for all types
    @Override
    public long getAllTotalPrice() {
        double getAllTotalPrice = 0;

        for (BaseEntityDao entityDao : baseEntityDaoList) {

            List<BaseEntity> baseEntity = entityDao.getAll();

            for (BaseEntity entity : baseEntity) {
                getAllTotalPrice += entity.getPrice();
            }
        }

        return (long) getAllTotalPrice;
    }

    // Method to return the average square meter
    @Override
    public double averageSquareMeter() {
        double averageSquareMeter = 0;

        for (BaseEntity home : baseEntityDao.getAll()) {
            averageSquareMeter += home.getSquareMeter();
        }

        return averageSquareMeter / baseEntityDao.getAll().size();
    }

    // Method to return the average square meter all types
    @Override
    public double getAllAverageSquareMeter() {
        double getAllAverageSquareMeter = 0;
        int totalEntity = 0;

        for (BaseEntityDao entityDao : baseEntityDaoList) {

            List<BaseEntity> entityList = entityDao.getAll();
            totalEntity += entityList.size();

            for (BaseEntity entity : entityList) {
                getAllAverageSquareMeter += entity.getSquareMeter();
            }

        }
        return getAllAverageSquareMeter / totalEntity;
    }

    // Filtering process according to the number of rooms by using the stream class
    @Override
    public List<BaseEntity> filterByRoom(int roomNumber) {
        List<BaseEntity> filterByRoomList = new LinkedList<>();

        for (BaseEntityDao entityDao : baseEntityDaoList) {

            List<BaseEntity> entityList = entityDao.getAll();

            filterByRoomList = entityList.stream().filter((room) -> room.getNumberOfRoom() == roomNumber).collect(Collectors.toList());

            filterByRoomList.forEach(System.out::println);
        }
        return filterByRoomList;
    }

    // Filtering process according to the number of lounges by using the stream class
    @Override
    public List<BaseEntity> filterByLounge(int loungeNumber) {
        List<BaseEntity> filterByLoungeList = new LinkedList<>();

        for (BaseEntityDao entityDao : baseEntityDaoList) {

            List<BaseEntity> entityList = entityDao.getAll();

            filterByLoungeList = entityList.stream().filter((lounge) -> lounge.getNumberOfLounge() == loungeNumber).collect(Collectors.toList());

            filterByLoungeList.forEach((lounge) -> System.out.println(lounge));
        }

        return filterByLoungeList;
    }
}
