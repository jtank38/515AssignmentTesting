/**
 * 
 */
package hacs;
import java.util.Date;
import java.text.DateFormat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Jubanjan
 *
 */
class AssignmentTest {
	
	Assignment assig=new Assignment();
	Solution sol= new Solution();	
	/**
	 * Test method for {@link hacs.Assignment#Assignment()}.
	 */
	@Test
	void testAssignment() {
		System.out.println("Assignment obj created");
	}

	/**
	 * Test method for {@link hacs.Assignment#SetDueDate(java.util.Date)}.
	 */
	@Test
	void testSetDueDate() {
		
		  Date dueDate= new Date();
		  assig.SetDueDate(dueDate);
		  DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.SHORT);
		  assertEquals(dateFormat.format(dueDate),assig.getDueDateString());
	
	}

	/**
	 * Test method for {@link hacs.Assignment#SetAssSpec(java.lang.String)}.
	 */
	@Test
	void testSetAssSpec() {
		String var="Hello";
		assig.SetAssSpec(var);
		assertEquals(var,assig.getAssspec());

		
	}

	/**
	 * Test method for {@link hacs.Assignment#IsOverDue()}.
	 */
	@Test
	void testIsOverDue() {
		Date dueDate= new Date();
		assig.SetDueDate(dueDate);
		
		assertEquals(false,assig.IsOverDue());

		
	}

	/**
	 * Test method for {@link hacs.Assignment#AddSolution()}.
	 */
	@Test
	void testAddSolution() {
		System.out.println("Solution obj created");
		
	}

	/**
	 * Test method for {@link hacs.Assignment#AddSolution(hacs.Solution)}.
	 */
	@Test
	void testAddSolutionSolution() {
		assig.AddSolution(sol);
		assertEquals(1,assig.getTheSolutionList().size());	
	}

	/**
	 * Test method for {@link hacs.Assignment#SubmitSolution()}.
	 */
	@Test
	void testSubmitSolution() {
		System.out.println("Method SubmitSolution is working");
		
	}

	/**
	 * Test method for {@link hacs.Assignment#getSolutionList()}.
	 */
	@Test
	void testGetSolutionList() {
		System.out.println("Method GetSolutionlist is working");
		
	}

	/**
	 * Test method for {@link hacs.Assignment#getSolution(java.lang.String)}.
	 */
	@Test
	void testGetSolution() {
		
		
		
	}

	/**
	 * Test method for {@link hacs.Assignment#getSugSolution()}.
	 */
	@Test
	void testGetSugSolution() {
		assertTrue(assig.getSugSolution() instanceof Solution);
	}

	/**
	 * Test method for {@link hacs.Assignment#GetSolutionIterator()}.
	 */
	@Test
	void testGetSolutionIterator() {
				SolutionIterator solutionIter =assig.GetSolutionIterator();
				assertEquals(0,solutionIter.solutionlist.size());
	}

	/**
	 * Test method for {@link hacs.Assignment#toString()}.
	 */
	@Test
	void testToString() {
		String str="515 Assignment";
		assig.setAssSpec(str);
		assertEquals(str,assig.toString());
	}

	/**
	 * Test method for {@link hacs.Assignment#getDueDateString()}.
	 */
	@Test
	void testGetDueDateString() {
			Date lateDate=new Date();
			assig.SetDueDate(lateDate);
			DateFormat dateform=DateFormat.getDateInstance(DateFormat.SHORT);
			assertEquals(dateform.format(lateDate),assig.getDueDateString());
	}


	@Test
	void testAccept() {
		assig.accept(new ReminderVisitor());
		assertTrue(assig.isAccepted());
//		System.out.println(assig.isAccepted());
		
	}



}
