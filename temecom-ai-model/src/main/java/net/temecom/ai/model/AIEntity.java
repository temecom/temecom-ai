package net.temecom.ai.model;

import org.springframework.data.annotation.Id;

public class AIEntity {
	@Id
	protected String id;
	
	protected String className;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String type) {
		this.className = type;
	}
}
