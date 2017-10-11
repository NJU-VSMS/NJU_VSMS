package nju.yva.model;

import lombok.Data;
import nju.yva.web.data.UserInfo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Water on 2017/8/19.
 */
@Data
@Entity
@Table(name = "user_data")
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "user_name")
    private String username;

    @NotNull
    @Column(name = "user_psw")
    private String password;

    @NotNull
    @Column(name = "real_name")
    private String name;

    @NotNull
    @Column(name = "stu_no")
    private String studentNo;

    @NotNull
    @Column(name = "vol_hours")
    private double volunteerTime;

    @NotNull
    @Column(name = "tel_nul")
    private String telNum;

    public UserData() {

    }
    public UserData(UserInfo userInfo) {
        this.id = userInfo.getId();
        this.username = userInfo.getUsername();
        this.password = userInfo.getPassword();
        this.name = userInfo.getName();
        this.studentNo = userInfo.getStudentNo();
        this.volunteerTime = userInfo.getVolunteerTime();
        this.telNum = userInfo.getTelNum();
    }
}
