package nju.yva.service.impl;

import nju.yva.dao.UserDao;
import nju.yva.model.UserData;
import nju.yva.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Water on 2017/8/19.
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public boolean addUser(UserData user) {
        return userDao.save(user) != null;
    }

    @Override
    public UserData getUser(long userId) {
        return userDao.findOneById(userId);
    }

    @Override
    public UserData getUser(String username) {
        return userDao.findOneByUsername(username);
    }

    @Override
    public List<UserData> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public boolean modifyUser(UserData modifiedUser) {
        if(userDao.findOneById(modifiedUser.getId()) == null) {
            return false;
        }
        return userDao.save(modifiedUser) != null;
    }

    @Override
    public boolean deleteUser(long id) {
        userDao.delete(id);
        return true;
    }
}
