package com.spring.classes;

public class ConstructorInjection {
        int id;
         String name;
         int roll;
         String school;
		public ConstructorInjection(int id, String name, int roll, String school) {
			super();
			this.id = id;
			this.name = name;
			this.roll = roll;
			this.school = school;
		}
		public void show()
		{
		System.out.println("this is is "+id+"  "+"this is name  "+name+" this is roll  "+roll+"  this is scholl"+school);;
		}
		
}
