package nju.yva.dao;

import nju.yva.model.ActivityData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Water on 2017/8/19.
 */
public interface ActivityDao extends JpaRepository<ActivityData, Long>{
    ActivityData findOneById(long id);

}
