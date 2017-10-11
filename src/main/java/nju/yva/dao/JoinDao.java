package nju.yva.dao;

import nju.yva.model.JoinData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Water on 2017/8/22.
 */
public interface JoinDao extends JpaRepository<JoinData, Long>{
    JoinData findOneByActivityIdAndUserName(long activityId, String userName);

    boolean existsByActivityIdAndUserName(long activityId, String userName);
}
