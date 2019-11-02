package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {
	Student stud= new Student();
	
	@Test
	void testCreateCourseMenu() {
		CourseMenu courseMenu=stud.CreateCourseMenu(new Course("CSE 564",0), 0);
		assertTrue(courseMenu instanceof HighLevelCourseMenu);
	}


	@Test
	void testStudent() {
		assertEquals(0,stud.type);
	}

}
