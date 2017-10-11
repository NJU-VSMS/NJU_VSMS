package nju.yva.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Alan on 2017/3/14
 */
@Data
@Entity
@Table(name = "data")
public class SampleData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Column(name = "name")
	private String name;

	@NotNull
	@Column(name = "detail")
	private String detail;

}
