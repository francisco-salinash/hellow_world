package com.test;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "beanB")
public class BeanB {

	private String value = "This editor is provided by PrimeFaces";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}