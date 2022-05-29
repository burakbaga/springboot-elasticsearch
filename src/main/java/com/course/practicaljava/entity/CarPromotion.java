package com.course.practicaljava.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="cars-index-2")
public class CarPromotion {
	private String type;
	private String description;
	

	
	public String getType() {
		return type;
	}



	public CarPromotion(String type, String description, String id) {
		super();
		this.type = type;
		this.description = description;
		this.id = id;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	@Id
	private String id;
	
	

}
