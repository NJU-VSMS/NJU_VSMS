package nju.yva.web.data;

import lombok.Data;

/**
 * Created by Water on 2017/8/11.
 */
@Data
public class RefusedActivity {
    // 活动的id
    private String activityId;
    // 活动名称
    private String activityName;
    // 不成功的理由
    private String reason;
}
