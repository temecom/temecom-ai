package net.temecom.ai.model;

import org.springframework.data.annotation.Id;

public class AIEntity {
	@Id
	protected String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
