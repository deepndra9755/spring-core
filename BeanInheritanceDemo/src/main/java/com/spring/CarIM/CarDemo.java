package com.spring.CarIM;

public class CarDemo {
	int carNum;
	String name;
	String modelNum;
	String Color;
	int Gear;
	String hechek;
	String owner;
	String ceat;
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}
	public void setColor(String color) {
		Color = color;
	}
	public void setGear(int gear) {
		Gear = gear;
	}
	public void setHechek(String hechek) {
		this.hechek = hechek;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setCeat(String ceat) {
		this.ceat = ceat;
	}
	@Override
	public String toString() {
		return "CarDemo [carNum=" + carNum + ", name=" + name + ", modelNum=" + modelNum + ", Color=" + Color
				+ ", Gear=" + Gear + ", hechek=" + hechek + ", owner=" + owner + ", ceat=" + ceat + "]";
	}
	

}
