package nju.yva.dao;

import nju.yva.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Water on 2017/8/19.
 */
public interface UserDao extends JpaRepository<UserData, Long> {
    UserData findOneById(long id);

    UserData findOneByUsername(String username);
}
