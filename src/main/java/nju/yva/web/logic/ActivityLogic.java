package nju.yva.web.logic;

import nju.yva.web.data.ActivityDetail;
import nju.yva.web.data.RefusedActivity;
import nju.yva.web.data.VoluntaryActivity;

import java.util.List;

/**
 * Created by Water on 2017/8/11.
 */
public interface ActivityLogic {
    /**
     * 收藏志愿活动
     *
     * @param username   用户名
     * @param activityId 活动的id
     * @return
     */
    boolean starVoluntaryActivity(String username, long activityId);


    /**
     * 取消收藏志愿活动
     *
     * @param username   用户名
     * @param activityId 活动的id
     * @return
     */
    boolean unstarVoluntaryActivity(String username, long activityId);


    /**
     * 查看已收藏志愿活动
     *
     * @param username 用户名
     * @return 返回该用户已收藏的志愿活动列表
     */
    List<VoluntaryActivity> getStaredVoluntaryActivities(String username);


    /**
     * 查看某志愿详细信息
     *
     * @param activityId 活动id
     * @return 返回活动的详细信息
     */
    ActivityDetail getActivityDetail(long activityId);


    /**
     * 查看不通过的志愿活动和理由
     *
     * @param username 用户名
     * @return 返回所有被拒的活动和理由（在RefusedActivity类里）
     */
    List<RefusedActivity> getRefusedActivities(String username);


    /**
     * 报名志愿活动
     *
     * @param username   用户名
     * @param activityId 活动id
     * @return
     */
    boolean joinActivity(String username, long activityId);


    /**
     * 取消报名志愿活动
     *
     * @param username   用户名
     * @param activityId 活动id
     * @return
     */
    boolean disjoinActivity(String username, long activityId);


    /**
     * 查看已报名未通过的志愿
     *
     * @param username 用户名
     * @return
     */
    List<VoluntaryActivity> getSignedUpVoluntaryActivities(String username);


    /**
     * 查看通过报名的志愿活动
     *
     * @param username 用户名
     * @return
     */
    List<VoluntaryActivity> getAcceptVoluntaryActivities(String username);


    /**
     * 查看所有志愿活动
     *
     * @return
     */
    List<VoluntaryActivity> getAllVoluntaryActivities();


    /**
     * 评论已参加的志愿活动
     *
     * @param username   用户名
     * @param activityId 活动id
     * @param comment    评价内容
     * @return
     */
    boolean makeComment(String username, long activityId, String comment);
}
