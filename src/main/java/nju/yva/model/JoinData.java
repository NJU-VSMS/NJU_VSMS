package nju.yva.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Water on 2017/8/22.
 */
@Data
@Table(name = "join_data")
public class JoinData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * TODO 外键
     */
    @NotNull
    private long activityId;


    @NotNull
    private String userName;
}
