package nju.yva.web.data;

import lombok.Data;

/**
 * Created by Water on 2017/8/11.
 */
@Data
public class VoluntaryActivity {
    // 活动的id
    private String id;
    // 活动的名称
    private String name;
    // 活动的简介
    private String introduction;
    // 是否已审核
    private boolean checked;
    // 是否通过审核
    private boolean passed;
    // 是否已收藏
    private boolean stared;
    // 是否已报名
    private boolean joined;
    // 是否已通过报名
    private boolean agreed;
    // 是否在招募志愿者
    private boolean hiring;
    // 是否已结束
    private boolean finished;
}
