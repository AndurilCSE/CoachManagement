package com.example.shiyam.dummy.hall;

/**
 * Created by shiyam on 2/2/16.
 */
public class Employee {
    private String name;
    private String id;
    private String position;
    private double salary;
	private String date;
	Hall hall;

    Employee(String name,String id,String position,double salary){
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    Employee(String name,String id,String position){
        this( name, id, position,0);
    }
    Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	
	public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }
	
	public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
	
	public void assign(){
		
	}
	
	public void work(){
		
	}
	
	public void move(){
		
	}
}
