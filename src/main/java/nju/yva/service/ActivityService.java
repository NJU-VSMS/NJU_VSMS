package nju.yva.service;

import nju.yva.model.ActivityData;

import java.util.List;

/**
 * Created by Water on 2017/8/19.
 */
public interface ActivityService {
    boolean addVoluntaryActivity(ActivityData activityData);

    ActivityData getVoluntaryActivity(long activityId);

    List<ActivityData> getAllActivities();

    boolean modifyActivity(ActivityData modifiedActivity);

    boolean deleteActivity(long id);
}
