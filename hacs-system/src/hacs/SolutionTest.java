/**@author Jubanjan Dhar
*@version 2.1**/
package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution sol= new Solution();
	
	@Test
	void testSolution() {
		System.out.println("Object of Solution Class has been created");
	}

	@Test
	void testToString() {
		sol.setTheAuthor("J.K.Rowling");
		sol.setSolutionFileName("harryPotter");
		assertEquals("J.K.Rowling  harryPotter Grade=0  not reported",sol.toString());
		
	}

	@Test
	void testGetGradeString() {
		assertEquals("-1",sol.getGradeString());
	}

	@Test
	void testGetGradeInt() {
		assertEquals(0,sol.getGradeInt());
	}

	@Test
	void testSetReported() {
		sol.setReported(true);
		assertTrue(sol.isReported());
	}

	@Test
	void testIsReported() {
		sol.setReported(true);
		assertTrue(sol.isReported());
	}

}
