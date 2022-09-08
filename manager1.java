package com.labsession.objects;
class Teacher{
	String name;
	String salary;
	String subject;
Teacher(){
	
}

Teacher(String name,String salary,String subject){
	this.name=name;
	this.salary=salary;
	this.subject=subject;
}
@Override
public boolean equals(Object obj) {
	if(!(obj instanceof Teacher)) {
		return false;
		
	}
Teacher b1 = (Teacher)obj;

boolean flags = ((b1.salary==this.salary)&&
 (b1.name==this.name)&&
 (b1.salary==this.salary));

return flags;
}
}

class Student{
	
	String name;
	String salary;
	String subject;
	
Student (){
	 
 }
 Student (String name,String salary,String subject){
	 this.name=name;
	 this.salary=salary;
	 this.subject=subject;
 }
 @Override
 public boolean equals(Object obj) {
	 if(!(obj instanceof Student b2)) {
		 return false;
	 }
	 Student b1 = (Student)obj;
	 boolean flags = ((b2.salary==this.salary)&&
			 (b2.name==this.name)&&
			 (b2.subject==this.subject));
	 return flags;
	 
 
 }

public class manager1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher obj = new Teacher("20000","aishu","science");
Teacher obj1 = new Teacher("10000","sandy","maths");
Teacher obj2 = new Teacher("","","");
obj.equals(obj1);

System.out.println(obj2.equals(obj));
System.out.println(obj.equals(obj2));

	}

}
}