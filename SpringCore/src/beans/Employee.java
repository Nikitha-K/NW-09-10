package beans;

import java.util.List;

public class Employee {

	private int empno;
	private String job;
	private int salary;
	
	private List<String> skills;
	
	
	
	
	public void start(){
		System.out.println("Start method");
	}
		public void stop(){
			System.out.println("Stop method");
	
	}
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public List<String> getSkills() {
			return skills;
		}
		public void setSkills(List<String> skills) {
			this.skills = skills;
		}
		
}
