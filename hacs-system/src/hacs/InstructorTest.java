/**@author Jubanjan Dhar**/
/**@version 2.1**/
package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InstructorTest {
	Instructor instruct=new Instructor();
	@Test
	void testCreateCourseMenu() {
		CourseMenu courseMenu=instruct.CreateCourseMenu(new Course("CSE580",0),0);
		assertTrue(courseMenu instanceof HighLevelCourseMenu);
	}


	@Test
	void testInstructor() {
		assertEquals(1,instruct.type);
	}

}
