package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDetails {

	private int userId;
	private String name;
	private int age;

	public void acceptUserDetails() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Useid");
			userId = scanner.nextInt();
			System.out.println("Enter Name");
			name = scanner.next();
			System.out.println("Enter age");
			age = scanner.nextInt();

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid Input");
			System.out.println("Please enter valid values");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something went wrong");
		}

	}

	public void displayUserDetails() {
		System.out.println(userId);
		System.out.println(name);
		System.out.println(age);
	}
}
