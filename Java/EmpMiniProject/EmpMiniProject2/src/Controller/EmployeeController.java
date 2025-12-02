package Controller;

import Model.Employee;

public class EmployeeController {
	EmployeeDAO ed=new EmployeeDAO();
	
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		if(ed.addEmployee(e)) {
			System.out.println("Successfull!!!");
		}else {
			System.out.println("Array is Full!!");
		}
		
	}

	public Employee searchEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee e1=ed.searchEmployee(id);
		if(e1!=null) {
			return e1;
		}
		return null;
	}

	public boolean updateEmployee(int id, double salary) {
		// TODO Auto-generated method stub
		if(ed.updateEmployee(id,salary)) {
			return true;
		}
		return false;
	}

	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		if(ed.deleteEmployee(id)) {
			return true;
		}
		return false;
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		ed.displayAll();
		
	}

	public void sortEmployees(int choice) {
		switch (choice) {
		case 1:
			ed.eList.sort(new SortById());
			break;
		case 2:
			ed.eList.sort(new SortByName());
			break;
		case 3:
			ed.eList.sort(new SortBySalary());
			break;
		case 4:
			ed.eList.sort(new SortByCommission());
			break;
		case 5:
			ed.eList.sort(new SortByAllowance());
			break;
		case 6:
			ed.eList.sort(new SortByTarget());
			break;
		case 7:
			ed.eList.sort(new SortByIncentive());
			break;
		default:
			System.out.println("Invalid Sort Choice!");
		}
	}
}
