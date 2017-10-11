package nju.yva.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Water on 2017/8/20.
 */
@Data
@Entity
@Table(name = "star_data")
public class StarData {
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
