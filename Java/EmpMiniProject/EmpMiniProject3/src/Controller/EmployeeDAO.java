package Controller;

import Model.Employee;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import Model.Admin;
import Model.HR;
import Model.SalesManager;

public class EmployeeDAO {

    static ArrayList<Employee> eList;

    static {
        eList = new ArrayList<>();
        eList.add(new HR(101, "Aditya", 50000, 5000));
        eList.add(new HR(102, "Amit", 48000, 4500));
        eList.add(new HR(103, "Suraj", 47000, 4000));
        eList.add(new SalesManager(201, "Minal", 60000, 12, 8000));
        eList.add(new SalesManager(202, "Sanjay", 58000, 15, 7500));
        eList.add(new SalesManager(203, "Chinmay", 62000, 10, 9000));
        eList.add(new Admin(301, "Harsh", 70000, 10000));
        eList.add(new Admin(302, "Ninad", 68000, 9500));
        eList.add(new Admin(303, "Vaibhav", 72000, 11000));
        eList.add(new Admin(304, "Rohit", 75000, 12000));
    }
    
    public static void saveToFile() {
        try {
    FileOutputStream fos = new FileOutputStream("Employee.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    
    oos.writeObject(eList);
    oos.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void loadFromFile() {
        try {
    FileInputStream fis = new FileInputStream("Employee.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    eList = (ArrayList<Employee>) ois.readObject();
    ois.close();
        } catch (Exception e) {
            System.out.println("Error loading file… loading default data.");
        }
    }

    boolean addEmployee(Employee e) {
		boolean result = eList.add(e);
		saveToFile();
		return result;
	}

    Employee SearchEnployee(int id) {
		for (Employee e : eList) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}

    boolean updateEmployee(int id, double salary) {
		for (Employee e : eList) {
			if (e.getId() == id) {
				e.setSalary(salary);
				saveToFile();
				return true;
			}
		}
		return false;
	}

    boolean deleteEmployee(int id) {
		for (Employee e : eList) {
			if (e.getId() == id) {
				eList.remove(e);
				saveToFile();
				return true;
			}
		}
		return false;
	}
    

    public void displayAll() {
        for (Employee emp : eList) {
            System.out.println(emp);
        }
    }
}

