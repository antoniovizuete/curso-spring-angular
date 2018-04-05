package com.avizuete.spring.core.scope.beans;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
	
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "SingletonBean [id=" + id + "]";
	}
		
}
