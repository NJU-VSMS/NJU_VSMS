package nju.yva.service;

import nju.yva.model.UserData;

import java.util.List;

/**
 * Created by Water on 2017/8/19.
 */
public interface UserService {
    boolean addUser(UserData user);

    UserData getUser(long userId);

    UserData getUser(String username);

    List<UserData> getAllUsers();

    boolean modifyUser(UserData modifiedUser);

    boolean deleteUser(long id);
}
