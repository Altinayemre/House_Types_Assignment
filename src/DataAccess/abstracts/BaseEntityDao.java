package DataAccess.abstracts;

import Entites.BaseEntity;

import java.util.List;

public interface BaseEntityDao {
    List<BaseEntity> getAll();
    List<BaseEntity> getAllList();
}
