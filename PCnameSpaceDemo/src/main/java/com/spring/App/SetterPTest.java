package com.spring.App;

public class SetterPTest {
	int pid;
	String name;
	String last;
	public void setPid(int pid) {
		this.pid = pid;
	}
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
