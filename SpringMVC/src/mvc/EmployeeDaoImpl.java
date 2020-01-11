package mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import beans.Employee;


@Repository
public class EmployeeDaoImpl {
	
	public List<Employee> getEmpls(){
		
		List<Employee> emplist = new ArrayList<Employee>();
		
		emplist.add(new Employee(101,"Akhil",2000));
		emplist.add(new Employee(102,"Parthu",4000));
		emplist.add(new Employee(103,"Shambu",24310));
		emplist.add(new Employee(104,"Swati",4000));
		emplist.add(new Employee(105,"Supriya",24310));
		
		
		
		return emplist;
		
	}

}
