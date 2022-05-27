package co.empresa.bbva.model;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill implements Serializable {
	private Integer id;
	private Date date;
	private Integer user_id;
	private Integer value;
	private Integer type;
	private String observation;

	public Bill(int id, Date date, int user_id, int value, int type, String observation) {
		this.id = id;
		this.date = date;
		this.user_id = user_id;
		this.value = value;
		this.type = type;
		this.observation = observation;
	}
}
