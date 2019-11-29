package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {

	public static void main(String[] args) {


		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single employee data");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch (ch) {

		case 1:

			//EmployeeDAOImpl impl = new EmployeeDAOImpl();

			EmployeeDAO daoAll = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = daoAll.EmployeeDAOData();

			for (EmployeeBean bean : result) {
				System.out.println("Name   : "+bean.getName());
				System.out.println("Id     : "+bean.getId());
				System.out.println("Gender : "+bean.getGenter());
				System.out.println("Salary : "+bean.getSal());
				System.out.println("------------------------------");
			}

			break;

		case 2:

			EmployeeDAO daoInsert = EmployeeManager.getEmployeeDAO();

			EmployeeBean beanInsert = new EmployeeBean();
			System.out.println("Enter New Id : ");
			beanInsert.setId(sc.nextInt());
			System.out.println("Enter Name : ");
			beanInsert.setName(sc.next());
			System.out.println("Enter Salary : ");
			beanInsert.setSal((int) sc.nextLong());
			System.out.println("Enter Gender [M / F / O]: ");
			beanInsert.setGenter(sc.next());
			int count_i = daoInsert.insertEmployeeData(beanInsert);

			if (count_i > 0) {
				System.out.println(count_i + " Row(S) inserted");
			}
			else {
				System.out.println("Try New..");
			}
			break;

		case 3:

			EmployeeDAO daoUpdate = EmployeeManager.getEmployeeDAO();
			EmployeeBean beanUpdate = new EmployeeBean();

			System.out.println("Enter old Id : ");
			beanUpdate.setId(sc.nextInt());
			System.out.println("Enter Name : ");
			beanUpdate.setName(sc.next());
			System.out.println("Enter Salary : ");
			beanUpdate.setSal((int) sc.nextLong());
			System.out.println("Enter Gender [M / F / O]: ");
			beanUpdate.setGenter(sc.next());

			int count_u = daoUpdate.updateEmployeeData(beanUpdate);
			
			if(count_u == 1) {
				System.out.println(count_u+"row(S) updated");
			}
			else {
				System.out.println("Try again");
			}

			break;
		case 4:

			EmployeeDAO daoDelete = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter ID for delete : ");
			int count_d = daoDelete.deleteEmployeeData(sc.nextInt());
			if (count_d == 1) {
				System.out.println(count_d + " row(s) deleted");
			}
			else 
				System.out.println("ID not present");
			break;
		case 5:
			//			EmployeeDAOImpl impl5 = new EmployeeDAOImpl();

			EmployeeDAO daoSearch = EmployeeManager.getEmployeeDAO(); 
			System.out.println("Enter ID : ");
			EmployeeBean bean5  =  daoSearch.searchEmployeeData(sc.nextInt());

			if(bean5!= null) {

				System.out.println("Name   : "+bean5.getName());
				System.out.println("Id     : "+bean5.getId());
				System.out.println("Gender : "+bean5.getGenter());
				System.out.println("Salary : "+bean5.getSal());

			}
			else {

				System.out.println("No Data Found");
			}
			break;

		default:
			break;
		}


	}

}
