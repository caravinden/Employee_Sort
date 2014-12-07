package com.aravind.emp.sort.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import com.aravind.emp.sort.Employee;

/**
 * class that contains functions for sorting employees based on there experience
 * Display in descending order of there experience
 * @author aravind
 *
 */
public class EmpApp {
	/**
	 * Application starts from here. creating employee object.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		EmpApp empApp = new EmpApp();
		empApp.sortByExp(Arrays.asList(new Employee("tom", 2), new Employee(
				"benny", 5), new Employee("jack", 3)));

	}

	/**
	 * Sorting the employee list using comparator interface
	 * 
	 * @param eList
	 */
	private void sortByExp(List<Employee> eList) {
		System.out.println("------Before sort------------" + eList.toString());

		Collections.sort(eList, new Comparator<Employee>() {

			public int compare(Employee o1, Employee o2) {
				return o1.getExp().compareTo(o2.getExp());
			}
		});

		/**
		 * Printing list in reverse order using ListIterator
		 */
		ListIterator<Employee> listIterator = eList.listIterator(eList.size());
		while (listIterator.hasPrevious()) {
			System.out.println("Elements ::" + listIterator.previous());
		}

		/**
		 * Printing list in reverse order using Collections.reverse() function
		 */
		Collections.reverse(eList);
		System.out.println("------After Sort------------" + eList.toString());
	}

}
