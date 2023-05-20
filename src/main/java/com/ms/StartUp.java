package com.ms;

import org.hibernate.SessionFactory;

public class StartUp {

	public static void main(String[] args) {
		System.out.println("Starting Application....");
		SessionFactory sessionFactory=Utility.getSessionFactory();
		System.out.println("Terminating Application...");
		
	}

}
