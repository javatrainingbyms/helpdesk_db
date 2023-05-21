package com.ms;

import java.sql.Date;
import java.util.Calendar;

import org.hibernate.Session;

import com.ms.entity.Priority;
import com.ms.entity.Ticket;
import com.ms.entity.User;

public class SearchTicketv {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Ticket t=session.get(Ticket.class, 1);
		System.out.println(t.getTcode());
		System.out.println(t.getText());
		System.out.println(t.getStatus());
		Date raiseDate=t.getRaiseDate();
		System.out.println("Raise Date  : "+raiseDate);
		Priority p=t.getPriority();
		int days=p.getSolutionDays();
		System.out.println("Days To Solve : "+days);
		
		//adding no of days to a date
		Calendar cal=Calendar.getInstance();
		cal.setTime(raiseDate);
		cal.add(Calendar.DATE, days);
		Date dueDate=new Date(cal.getTimeInMillis());
		System.out.println("Due Date : "+dueDate);
		
		
		session.close();
	}

}
