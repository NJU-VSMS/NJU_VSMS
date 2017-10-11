package nju.yva.service.impl;

import nju.yva.dao.JoinDao;
import nju.yva.model.JoinData;
import nju.yva.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Water on 2017/8/22.
 */
public class JoinServiceImpl implements JoinService{

    private JoinDao dao;

    @Autowired
    public JoinServiceImpl(JoinDao joinDao) {
        this.dao = joinDao;
    }

    @Override
    public boolean joinService(String username, long activityId) {
        if(dao.existsByActivityIdAndUserName(activityId, username)) {
            return false;
        }
        JoinData data = new JoinData();
        data.setActivityId(activityId);
        data.setUserName(username);
        return dao.save(data) != null;
    }

    @Override
    public boolean disjoinService(String username, long activityId) {
        if(!dao.existsByActivityIdAndUserName(activityId, username)) {
            return false;
        }
        JoinData data = dao.findOneByActivityIdAndUserName(activityId, username);
        dao.delete(data);
        return true;
    }
}
