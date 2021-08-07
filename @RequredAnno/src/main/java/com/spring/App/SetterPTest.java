package com.spring.App;

import org.springframework.beans.factory.annotation.Required;

public class SetterPTest {
	int pid;
	String name;
	String last;
	@Required
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public void setLast(String last) {
		this.last = last;
	}
	@Override
	public String toString() {
		return "SetterPTest [pid=" + pid + ", name=" + name + ", last=" + last + "]";
	}
	
	

}
