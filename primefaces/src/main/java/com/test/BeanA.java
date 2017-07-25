package com.test;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "beanA")
public class BeanA {

	private String value = "This editor is provided by PrimeFaces";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}