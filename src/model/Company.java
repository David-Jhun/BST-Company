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

}
