package com.hsbc.cloneexample;
public class Employee3 implements Cloneable {
	private int eid;
	private String ename;
	private Address addr;

	Employee3() {
		System.out.println("o args cons executed..");
	}

	public Employee3(Employee3 original) {
		System.out.println("Copy constructor executed.....");
		eid = original.eid;
		ename = original.ename;
		addr = original.addr;
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

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public String toString() {
		return "Employee3 [eid=" + eid + ", ename=" + ename + ", addr=" + addr + "]";
	}

	protected Object clone() throws CloneNotSupportedException {
		Employee3 cloned = (Employee3) super.clone();
		cloned.setAddr((Address) cloned.getAddr().clone());
		return cloned;
	}
	/*
	 * protected Object clone() throws CloneNotSupportedException { // TODO
	 * Auto-generated method stub return super.clone(); }
	 */

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee3 original = new Employee3();
		original.setEid(1);
		original.setEname("Bapun Parida");
		original.setAddr(new Address(1, "Rajaloka"));
		System.out.println("Original Employee obj" + original);
		Employee3 clone = (Employee3) original.clone();
		System.out.println(clone);
//		clone.getAddr().setAddress("hyderabad..");
		System.out.println("Original changed check it" + original);// not
																	// changed...
		Employee3 emp = new Employee3(original);
		System.out.println(emp);
		// deep clonning

	}

}
