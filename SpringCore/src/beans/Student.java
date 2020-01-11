package beans;

public class Student {
	
	private Address addr;
	
	private int regno;
	private String stdname;
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Student(int regno, String stdname) {
		super();
		this.regno = regno;
		this.stdname = stdname;
	}
	
	
	
	
	
	
	
	

	

}
