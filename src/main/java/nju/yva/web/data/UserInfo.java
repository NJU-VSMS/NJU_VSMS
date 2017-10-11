package nju.yva.web.data;

import lombok.Data;
import nju.yva.model.UserData;

/**
 * Created by Water on 2017/8/11.
 */
@Data
public class UserInfo {
    // 用户的id
    private long id;
    // 用户名
    private String username;
    // 用户的密码
    private String password;
    // 用户的名字
    private String name;
    // 用户的学号
    private String studentNo;
    // 用户的志愿时长
    private double volunteerTime;
    // 用户的电话号码
    private String telNum;

    public UserInfo() {

    }

    public UserInfo(UserData userData) {
        this.id = userData.getId();
        this.username = userData.getUsername();
        this.password = userData.getPassword();
        this.name = userData.getName();
        this.studentNo = userData.getStudentNo();
        this.volunteerTime = userData.getVolunteerTime();
        this.telNum = userData.getTelNum();
    }
}
