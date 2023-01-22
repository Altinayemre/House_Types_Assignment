package Services.abstracts;

import DataAccess.abstracts.BaseEntityDao;
import Entites.BaseEntity;

import java.util.List;

public interface BaseEntityService {
    List<BaseEntity> getAllList();

    long totalPrice();

    long getAllTotalPrice();

    double averageSquareMeter();

    double getAllAverageSquareMeter();

    List<BaseEntity> filterByRoom(int roomNumber);

    List<BaseEntity> filterByLounge(int loungeNumber);
}
