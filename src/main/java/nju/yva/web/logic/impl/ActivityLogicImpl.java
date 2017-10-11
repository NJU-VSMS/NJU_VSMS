package nju.yva.web.logic.impl;

import nju.yva.service.JoinService;
import nju.yva.service.StarService;
import nju.yva.web.data.ActivityDetail;
import nju.yva.web.data.RefusedActivity;
import nju.yva.web.data.VoluntaryActivity;
import nju.yva.web.logic.ActivityLogic;
import nju.yva.web.logic.BaseLogic;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Water on 2017/8/19.
 */
public class ActivityLogicImpl extends BaseLogic implements ActivityLogic{

    private StarService starService;
    private JoinService joinService;
    @Autowired
    public ActivityLogicImpl(StarService starService, JoinService joinService) {
        this.starService = starService;
        this.joinService = joinService;
    }
    /**
     * 收藏志愿活动
     * @param username   用户名
     * @param activityId 活动的id
     * @return
     */
    @Override
    public boolean starVoluntaryActivity(String username, long activityId) {
        return starService.starActivity(username, activityId);
    }

    /**
     * 取消收藏志愿活动
     * @param username   用户名
     * @param activityId 活动的id
     * @return
     */
    @Override
    public boolean unstarVoluntaryActivity(String username, long activityId) {
        return starService.unstarActivity(username, activityId);
    }

    /**
     * 查看已收藏志愿活动
     * TODO PO与VO的转换
     * @param username 用户名
     * @return 返回该用户已收藏的志愿活动列表
     */
    @Override
    public List<VoluntaryActivity> getStaredVoluntaryActivities(String username) {
        return null;
    }

    /**
     * 查看某志愿详细信息
     * TODO PO与VO的转换
     * @param activityId 活动id
     * @return 返回活动的详细信息
     */
    @Override
    public ActivityDetail getActivityDetail(long activityId) {
        return null;
    }

    /**
     * 查看不通过的志愿活动和理由
     * TODO PO与VO的转换
     * @param username 用户名
     * @return 返回所有被拒的活动和理由（在RefusedActivity类里）
     */
    @Override
    public List<RefusedActivity> getRefusedActivities(String username) {
        return null;
    }

    /**
     * 报名志愿活动
     * @param username   用户名
     * @param activityId 活动id
     * @return
     */
    @Override
    public boolean joinActivity(String username, long activityId) {
        return joinService.joinService(username, activityId);
    }

    /**
     * 取消报名志愿活动
     * @param username   用户名
     * @param activityId 活动id
     * @return
     */
    @Override
    public boolean disjoinActivity(String username, long activityId) {
        return joinService.disjoinService(username, activityId);
    }

    /**
     * 查看已报名未通过的志愿
     * TODO PO与VO的转换
     * @param username 用户名
     * @return
     */
    @Override
    public List<VoluntaryActivity> getSignedUpVoluntaryActivities(String username) {
        return null;
    }

    /**
     * 查看通过报名的志愿活动
     * TODO PO与VO的转换
     * @param username 用户名
     * @return
     */
    @Override
    public List<VoluntaryActivity> getAcceptVoluntaryActivities(String username) {
        return null;
    }

    /**
     * 查看所有志愿活动
     * TODO:PO与VO的转换
     * @return
     */
    @Override
    public List<VoluntaryActivity> getAllVoluntaryActivities() {
        return null;
    }

    /**
     * 评论已参加的志愿活动
     * TODO PO与VO的转换
     * @param username   用户名
     * @param activityId 活动id
     * @param comment    评价内容
     * @return
     */
    @Override
    public boolean makeComment(String username, long activityId, String comment) {
        return false;
    }
}
