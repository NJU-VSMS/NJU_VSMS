package nju.yva.service.impl;

import nju.yva.dao.ActivityDao;
import nju.yva.model.ActivityData;
import nju.yva.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Water on 2017/8/19.
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    ActivityDao activityDao;

    @Autowired
    public ActivityServiceImpl(ActivityDao activityDao) {
        this.activityDao = activityDao;
    }

    @Override
    public boolean addVoluntaryActivity(ActivityData activityData) {
        if(activityData.getVoluntaryHours() <= 0) {
            return false;
        }
        return activityDao.save(activityData) != null;
    }

    @Override
    public ActivityData getVoluntaryActivity(long activityId) {
        return activityDao.findOneById(activityId);
    }

    @Override
    public List<ActivityData> getAllActivities() {
        return activityDao.findAll();
    }

    @Override
    public boolean modifyActivity(ActivityData modifiedActivity) {
        if(activityDao.findOneById(modifiedActivity.getId()) == null) {
            return false;
        }
        return addVoluntaryActivity(modifiedActivity);
    }

    @Override
    public boolean deleteActivity(long id) {
        activityDao.delete(id);
        return true;
    }
}
