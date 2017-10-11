package nju.yva.service.impl;

import nju.yva.dao.StarDao;
import nju.yva.model.StarData;
import nju.yva.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Water on 2017/8/20.
 */
public class StarServiceImpl implements StarService{

    StarDao dao;
    @Autowired
    public StarServiceImpl(StarDao starDao) {
        this.dao = starDao;
    }

    /**
     * @param username
     * @param activityId
     * @return
     */
    @Override
    public boolean starActivity(String username, long activityId) {
        if(dao.existsByActivityIdAndUserName(activityId, username)) {
            return false;
        }
        StarData data = new StarData();
        data.setActivityId(activityId);
        data.setUserName(username);
        return dao.save(data) != null;
    }

    @Override
    public boolean unstarActivity(String username, long activityId) {
        if(!dao.existsByActivityIdAndUserName(activityId, username)) {
            return false;
        }
        StarData data = dao.findOneByActivityIdAndUserName(activityId, username);
        dao.delete(data);
        return true;
    }
}
