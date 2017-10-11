package nju.yva.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Water on 2017/8/19.
 */
@Data
@Entity
@Table(name = "activity_data")
public class ActivityData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "voluntary_type")
    private String type;

    @NotNull
    @Column(name = "activity_name")
    private String name;

    @NotNull
    @Column(name = "voluntary_hours")
    private int voluntaryHours;
}
