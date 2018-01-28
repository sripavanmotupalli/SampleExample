package Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapAdvanceExample {

	public static void main(String args[]) {

		// Employee emp = new Employee(0, null, null, 0, null);

		/*
		 * Map<Integer,String[] > employeeList=new HashMap<Integer,String[] >();
		 * employeeList.put(1,"Sree","IT","SanJose");
		 */

		Map<Integer, Employee> empmap = new HashMap<>();

		empmap.put(1, new Employee(1, "sree", "IT", 68550.56, "Sanjose"));
		empmap.put(2, new Employee(2, "Pavan", "Software", 76850.56, "NewJersy"));
		empmap.put(3, new Employee(3, "Mahi", "Hr", 98850.56, "NewYork"));
		empmap.put(4, new Employee(4, "Naresh", "DBA", 89550.56, "Edison"));
		empmap.put(5, new Employee(5, "Rahul", "SQL", 65850.56, "California"));
		empmap.put(6, new Employee(6, "Reneeth", "Testing", 64850.56, "Denwark"));

		Iterator it = empmap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry key = (Map.Entry) it.next();

			System.out.println(" Using while loop--> EmployeeList: " + key.getValue().toString());
		}

		for (Map.Entry key : empmap.entrySet()) {
			System.out.println(" \n Using for loop--> EmployeeList: " + key.getValue().toString());
		}

		System.out.println("\n \n Emplloyee information for the key 3" + ": " + empmap.get(3).toString());

	}

}
