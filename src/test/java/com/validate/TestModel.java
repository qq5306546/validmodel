package com.validate;

import java.math.BigDecimal;

import com.validmodel.annotation.ValidateAnnotation.Number;
import com.validmodel.annotation.ValidateAnnotation.URL;
import com.validmodel.annotation.ValidateAnnotation.Number.NumberType;

public class TestModel {

	public int id;
	@URL
	public String name;
	@Number(NumberType.POSITIVE_INT)
	public BigDecimal money;
	public Integer count;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	
}
