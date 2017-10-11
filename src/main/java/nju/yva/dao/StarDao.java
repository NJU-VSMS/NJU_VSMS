package nju.yva.dao;

import nju.yva.model.StarData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Water on 2017/8/20.
 */
public interface StarDao extends JpaRepository<StarData, Long>{
    StarData findOneByActivityIdAndUserName(long activityId, String userName);

    boolean existsByActivityIdAndUserName(long activityId, String userName);
}
