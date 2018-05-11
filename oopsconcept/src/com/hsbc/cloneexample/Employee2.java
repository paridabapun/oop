package com.hsbc.cloneexample;
public class Employee2 implements Cloneable {
	private int eid;
	private String ename;
	private Address addr;

	public Employee2(Employee2 e2) {
		addr = e2.addr;
		ename = e2.ename;
		eid = e2.eid;

	}

	public Employee2(int eid, String ename, Address addr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.addr = addr;
	}

	public String toString() {
		return "Employee2 [eid=" + eid + ", ename=" + ename + ", addr=" + addr + "]";
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

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Address addr = new Address(1, "Rajaloka");
		Employee2 original = new Employee2(1, "Bapun", addr);
		System.out.println(original);
		Employee2 cloned = (Employee2) original.clone();

		// Must be true and objects must have different memory addresses
		System.out.println(original != cloned);

		// As we are returning same class; so it should be true
		System.out.println(original.getClass() == cloned.getClass());

		// Default equals method checks for refernces so it should be false. If
		// we want to make it true,
		// we need to override equals method in Employee class.
		System.out.println(original.equals(cloned));
		System.out.println(cloned);

		// problem in the code see below...
//		cloned.getAddr().setAddress("Pune");
		System.out.println(original);// value changed.....
		// Oops, cloned object changes are visible in original also. This way
		// cloned objects can make havoc in system if allowed to do so. Anybody
		// can come and clone your application objects and do whatever he likes.
		// Can we prevent this??

		// Answer is yes, we can. We can prevent this using deep cloning and use
		// copy constructors.
		Employee2 emp = new Employee2(original);
		System.out.println("Copy Constructor.... " + emp);
//		emp.getAddr().setAddress("New Pune");
		System.out.println(original);// not at all
		emp.setEname("Hari");
		System.out.println(original);// not effected in case of primitive....

	}
}
