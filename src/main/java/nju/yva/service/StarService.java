package nju.yva.service;

/**
 * Created by Water on 2017/8/20.
 */
public interface StarService {
    boolean starActivity(String username, long activityId);

    boolean unstarActivity(String username, long activityId);
}
