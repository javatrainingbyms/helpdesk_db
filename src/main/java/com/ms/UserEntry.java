package com.ms;

import java.util.Scanner;

import com.ms.entity.User;
import com.ms.repo.UserRepository;

public class UserEntry {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Userid : ");
		String userId=sc.next();
		System.out.println("Enter Password : ");
		String password=sc.next();
		System.out.println("Enter Name : ");
		String name=sc.next();
		System.out.println("Enter Email : ");
		String email=sc.next();
		System.out.println("Enter Mobile : ");
		String mobile=sc.next();
		System.out.println("Enter UserType : ");
		String userType=sc.next();
		
		User user=new User(userId,password,name,email,mobile,userType);
		
		UserRepository userRepository=new UserRepository();
		userRepository.saveUser(user);
		
		System.out.println("Data Stored...");
		

	}

}
