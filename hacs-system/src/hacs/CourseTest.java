/**@author Jubanan Dhar**/
/**@version 2.1**/
package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CourseTest {
	Course course =new Course("CSE890",3);
	@Test
	void testCourse() {
		assertEquals(3,course.getCourseLevel());
		
	}

	@Test
	void testAddAssignment() {
		Assignment assign=new Assignment();
		course.AddAssignment(assign);
		assertEquals(1,course.assignmentList.size());
	}

	@Test
	void testToString() {
		String courseTitle="CSE890";
		assertEquals(courseTitle,course.toString());
	}

	@Test
	void testAccept() {
		
	}

}
