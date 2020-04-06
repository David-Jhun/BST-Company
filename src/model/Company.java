package model;

public class Company {
	
	private Employee root;
	
	public Company() {
		root = null;
	}
	
	public Employee getRoot() {
		return root;
	}
	
	public void add( String id, String name, int office ) {
		Employee newOne = new Employee( id, name, office );
		if( root == null ) {
			root = newOne;
		}else if( root.compareTo(newOne) < 0 ){
			if( root.getLeftSon() == null ) {
				root.setLeftSon(newOne);
				newOne.setFather(root);
			}else {
				add(root.getLeftSon(), newOne);
			}
		}else {
			if( root.getRightSon() == null ) {
				root.setRightSon(newOne);
				newOne.setFather(root);
			}else {
				add(root.getRightSon(), newOne);
			}
		}
	}
	
	private void add( Employee currentRoot, Employee newOne ) {
		if( currentRoot == null ) {
			currentRoot = newOne;
		}else if( currentRoot.compareTo(newOne) < 0 ) {
			if( currentRoot.getLeftSon() == null ) {
				currentRoot.setLeftSon(newOne);
				newOne.setFather(currentRoot);
			}else {
				add(currentRoot.getLeftSon(), newOne);
			}
		}else {
			if( currentRoot.getRightSon() == null ) {
				currentRoot.setRightSon(newOne);
				newOne.setFather(currentRoot);
			}else {
				add(currentRoot.getRightSon(), newOne);
			}
		}
	}
	
	public void addIterative( String id, String name, int office ) {
		Employee newOne = new Employee(id, name, office);
		if( root == null ) {
			root = newOne;
		}else {
			Employee current = root;
			Employee father = null;
			boolean added = false;
			while( !added ) {
				father = current;
				if( current.compareTo(newOne) < 0 ) {
					current = current.getLeftSon();
					if( current == null ) {
						father.setLeftSon(newOne);
						newOne.setFather(father);
						added = true;
					}
				}else {
					current = current.getRightSon();
					if( current == null ) {
						father.setRightSon(newOne);
						newOne.setFather(father);
						added = true;
					}
				}
			}
		}
	}
	
	public Employee search( String id ) {
		Employee employee = null;
		if( root != null ) {
			if( root.getId().equals(id) ) {
				employee = root;
			}else if( root.getId().compareTo(id) < 0 ) {
				employee = search(id, root.getLeftSon());
			}else {
				employee = search(id, root.getRightSon());
			}
		}
		return employee;
	}
	
	private Employee search( String id, Employee current ) {
		Employee employee = null;
		if( current.getId().equals(id) ) {
			employee = current;
		}else if( current.getId().compareTo(id) < 0 ) {
			employee = search(id, current.getLeftSon());
		}else {
			employee = search(id, current.getRightSon());
		}
		return employee;
	}
	
	public Employee searchIterative( String id ) {
		Employee employee = null;
		if( root != null ) {
			if( root.getId().equals(id) ) {
				employee = root;
			}else {
				boolean done = false;
				employee = root;
				while( !(employee.getId().equals(id)) && !done ) {
					if( employee.getId().compareTo(id) < 0 ) {
						employee = employee.getLeftSon();
					}else {
						employee = employee.getRightSon();
					}
					if( employee == null ) {
						done = true;
					}
				}
			}
		}
		return employee;
	}

}
