package LESSON10.Prob2.prob2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		List<Employee> ls = new ArrayList<>();
		for (Employee em : table.values()) {
			if (socSecNums.contains(em.getSsn()) && em.getSalary() > 80000) {
				ls.add(em);

			}
		}
		ls.sort((s1, s2) -> s1.getSsn().compareTo(s2.getSsn()));
		return ls;


	}
	
}
