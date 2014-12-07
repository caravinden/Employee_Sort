package com.aravind.emp.sort;
public class Employee {

	private String name;
	private Integer exp;
	
	public Employee(){
		
	}
	
	/**
	 * @param name
	 * @param exp
	 */
	public Employee(String name, Integer exp) {
		super();
		this.name = name;
		this.exp = exp;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the exp
	 */
	public Integer getExp() {
		return exp;
	}
	/**
	 * @param exp the exp to set
	 */
	public void setExp(Integer exp) {
		this.exp = exp;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		// TODO Auto-generated method stub
		return "Name::"+name+"---Exp"+exp;
	}
	
}
