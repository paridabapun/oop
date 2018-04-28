package com.hsbc.cloneexample;

public class Employee implements Cloneable {
	private int eid;
	private String ename;

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee(1, "Bhagabata");
		e1.setEid(3);
		e1.setEname("Geeta");
		System.out.println(e1.clone() != e1);
		System.out.println(e1);
		Employee e2;
		e2 = (Employee) e1.clone();
		System.out.println(e2);// Shallow Copy
		System.out.println("e1 :" + e1.hashCode());
		System.out.println("e2 :" + e2.hashCode());//
		System.out.println(e1 == e2);

	}
}
