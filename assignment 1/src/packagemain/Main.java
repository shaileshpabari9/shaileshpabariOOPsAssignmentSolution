package packagemain;

import java.util.Scanner;

import pacakgeFour.TechDepartment;
import packageOne.SuperDepartment;
import packageThree.HrDepartment;
import packageTwo.AdminDepartment;

public class Main  {

public  static void main (String[] args){
	
AdminDepartment cam= new AdminDepartment();
	

	System.out.println("Welcome to " + cam.departmentName());
	System.out.println(cam.getTodaysWork());
	System.out.println(cam.getWorkDeadline());
	System.out.println(cam.isTodayAHoliday());
	
HrDepartment dam= new HrDepartment();
	

	System.out.println();
	
	System.out.println("Welcome to " + dam.departmentName());
	System.out.println(dam.doActivity());
	System.out.println(dam.getTodaysWork());
	
	System.out.println(dam.getWorkDeadline());
	
	System.out.println(dam.isTodayAHoliday());
	
	
TechDepartment lam= new TechDepartment();

	
	System.out.println();
	System.out.println("Welcome to " + lam.departmentName());
	System.out.println(lam.getTodaysWork());
	System.out.println(lam.getWorkDeadline());
	System.out.println(lam.getTechStackInformation());
	System.out.println(lam.isTodayAHoliday());
	
	
}
}
