import DataAccess.abstracts.BaseEntityDao;
import DataAccess.concretes.InMemoryHomeDao;
import DataAccess.concretes.InMemorySummerHouseDao;
import DataAccess.concretes.InMemoryVillaDao;
import Entites.BaseEntity;
import Entites.Home;
import Entites.SummerHouse;
import Entites.Villa;
import Services.abstracts.BaseEntityService;
import Services.concretes.BaseEntityManager;
import Services.constants.Message;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        BaseEntityDao[] entitiesDao = {new InMemoryHomeDao(), new InMemoryVillaDao(), new InMemorySummerHouseDao()};
        List<BaseEntityDao> baseEntityDaoList = Arrays.stream(entitiesDao).collect(Collectors.toList());

        System.out.println(Message.HOMES);
        BaseEntityService homeManager = new BaseEntityManager(baseEntityDaoList.get(0));
        // LISTS ALL THE HOUSES
        homeManager.getAllList();
        // RETURNS THE TOTAL PRICES OF ALL HOUSES
        System.out.println(Message.TOTAL_PRICE_HOMES + homeManager.totalPrice() + Message.₺);
        // THE AVERAGE SQUARE METER OF HOUSES
        System.out.println(Message.AVERAGE_SQUARE_METER + homeManager.averageSquareMeter() + Message.m2);

        System.out.println(" ");

        System.out.println(Message.VILLAS);
        BaseEntityService villaManager = new BaseEntityManager(baseEntityDaoList.get(1));
        // LISTS ALL THE VILLAS
        villaManager.getAllList();
        // RETURNS THE TOTAL PRICES OF ALL VILLAS
        System.out.println(Message.TOTAL_PRICE_VILLAS + villaManager.totalPrice() + Message.₺);
        // RETURNS THE AVERAGE SQUARE METER OF VILLAS
        System.out.println(Message.AVERAGE_SQUARE_METER + villaManager.averageSquareMeter() + Message.m2);

        System.out.println(" ");

        System.out.println(Message.SUMMER_HOUSES);
        BaseEntityService summerHouseManager = new BaseEntityManager(baseEntityDaoList.get(2));
        // LISTS ALL THE SUMMER HOUSES
        summerHouseManager.getAllList();
        // RETURNS THE TOTAL PRICES OF ALL SUMMER HOUSES
        System.out.println(Message.TOTAL_PRICE_SUMMER_HOUSES + summerHouseManager.totalPrice() + Message.₺);
        // RETURNS THE AVERAGE SQUARE METER OF SUMMER HOUSES
        System.out.println(Message.AVERAGE_SQUARE_METER + summerHouseManager.averageSquareMeter() + Message.m2);

        System.out.println(" ");

        BaseEntityService allTypesManager = new BaseEntityManager(baseEntityDaoList);
        // RETURNS THE TOTAL PRICES OF ALL TYPES
        System.out.println(Message.ALL_TYPES_TOTAL_PRICE + allTypesManager.getAllTotalPrice() + Message.₺);
        // RETURNS THE AVERAGE SQUARE METER OF ALL TYPES
        System.out.println(Message.ALL_TYPES_AVERAGE_SQUARE_METER +allTypesManager.getAllAverageSquareMeter()+ Message.m2);

        System.out.println(" ");

        System.out.println(Message.FILTER_ALL_TYPES_BY_NUMBER_OF_ROOMS);
        // FILTER ALL TYPES BY NUMBER OF ROOMS
        allTypesManager.filterByRoom(4);

        System.out.println(" ");

        System.out.println(Message.FILTER_ALL_TYPES_BY_NUMBER_OF_LOUNGE);
        // FILTER ALL TYPES BY NUMBER OF LOUNGE
        allTypesManager.filterByLounge(2);
    }
}