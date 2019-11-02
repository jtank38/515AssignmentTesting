/**@author Jubanjan Dhar
*@version 2.1**/
package hacs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class ReminderVisitorTest {


	@Test
	void testVisitAssignment() {
		ReminderVisitor remindVisit=new ReminderVisitor(new Reminder());
		Assignment assign= new Assignment();
		assign.setAssSpec("Assignment 1");
		assign.SetDueDate(new Date());
		remindVisit.visitAssignment(assign);
		assertNotNull(remindVisit.getM_Reminder().listUpcoming);
	}

	@Test
	void testReminderVisitor() {
		System.out.println("ReminderVisitor was implemented!");
		
	}

	@Test
	void testReminderVisitorReminder() {
		ReminderVisitor remindVisit=new ReminderVisitor(new Reminder());
		assertNotNull(remindVisit.getM_Reminder());
	}

}
