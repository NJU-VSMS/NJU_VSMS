package nju.yva.service;

/**
 * Created by Water on 2017/8/22.
 */
public interface JoinService {
    boolean joinService(String username, long activityId);

    boolean disjoinService(String username, long activityId);
}
