package com.greatlearning.GroupAssignment_1.main;


import com.greatlearning.GroupAssignment_1.model.Tech;
import com.greatlearning.GroupAssignment_1.model.Admin;
import com.greatlearning.GroupAssignment_1.model.HR;

public class DriverClassMain {
	
	public static void main(String args[]) 
	{
		
		Admin  obj1 = new Admin();
		
		System.out.println("Welome to " + obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		
		
		HR  obj2 = new HR();
		
		System.out.println("\n\nWelome to " + obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());
		
		
		Tech  obj3 = new Tech();
		
		System.out.println("\n\nWelome to " + obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());
		
		
	}

}
