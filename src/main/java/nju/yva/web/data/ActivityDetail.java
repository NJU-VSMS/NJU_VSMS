package nju.yva.web.data;

import lombok.Data;

/**
 * Created by Water on 2017/8/11.
 */
@Data
public class ActivityDetail {
    private long activityId;
    // 活动的名称
    private String name;
    // 发起组织
    private String organization;
    // 志愿时长
    private int awardHour;
    // 当前通过报名的志愿者
    private int currentVolunteerNum;
    // 招募的志愿者数量
    private int limitVolunteerNum;
    // 活动的起始时间
    private String activityTime;
    // 活动的地点
    private String activityPlace;
    // 活动的类型
    private String activityType;
    // 对志愿者的要求
    private String requirement;
}
