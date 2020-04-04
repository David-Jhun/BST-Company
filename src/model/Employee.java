package model;

public class Employee implements Comparable<Employee>{
	
	private String id;
	private String name;
	private int office;
	
	private Employee father;
	private Employee leftSon;
	private Employee rightSon;
	
	public Employee( String id, String name, int office ) {
		this.id = id;
		this.name = name;
		this.office = office;
		father = null;
		leftSon = null;
		rightSon = null;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getOffice() {
		return office;
	}

	public Employee getFather() {
		return father;
	}

	public Employee getLeftSon() {
		return leftSon;
	}

	public Employee getRightSon() {
		return rightSon;
	}

	public void setFather(Employee father) {
		this.father = father;
	}

	public void setLeftSon(Employee leftSon) {
		this.leftSon = leftSon;
	}

	public void setRightSon(Employee rightSon) {
		this.rightSon = rightSon;
	}

	@Override
	public String toString() {
		String i = "";
		i = "\nId: " + id;
 		return i; 
	}

	@Override
	public int compareTo(Employee employee) {
		int c = 0;
		if( id.compareTo(employee.id) < 0 )
			c = -1;
		else if( id.compareTo(employee.id) > 0 )
			c = 1;
		else {
			if( name.compareToIgnoreCase(employee.name) < 0 )
				c = -1;
			else if( name.compareToIgnoreCase(employee.name) > 0 )
				c = 1;
			else {
				if( office < employee.office )
					c = -1;
				else if( office > employee.office )
					c = 1;
			}
		}
		return c;
	}
	
	

}
