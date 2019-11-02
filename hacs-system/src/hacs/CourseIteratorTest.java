/**@author Jubanjan Dhar88**/
/**@version 2.0**/
package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CourseIteratorTest {
	CourseIterator classcourseiterator= new CourseIterator();
	Course course =new Course("CSE890",3);
	ClassCourseList courselist = new ClassCourseList();

	@Test
	void testCourseIterator() {
		
	}

	@Test
	void testCourseIteratorClassCourseList() {
		
	}

	@Test
	void testHasNext() {
		Course course=new Course("CourseTest ",1);
		courselist.add(course);
		CourseIterator classcourseiterator= new CourseIterator(courselist);
		assertTrue(classcourseiterator.hasNext());
	}

	@Test
	void testNext() {
		Course course =new Course("CourseTest",1);
		courselist.add(course);
		CourseIterator classcourseiterator= new CourseIterator(courselist);
		assertNotNull(classcourseiterator.next());
	}

	@Test
	void testRemove() {
		Course course =new Course("CourseTest",1);
		courselist.add(course);
		CourseIterator classcourseiterator= new CourseIterator(courselist);
		classcourseiterator.next();
		classcourseiterator.remove();
		assertEquals(0,classcourseiterator.getTheCourseList().size());
	}

	@Test
	void testNextString() {
		Course course =new Course("CourseTest",1);
		courselist.add(course);
		CourseIterator classcourseiterator= new CourseIterator(courselist);
		assertNotNull(classcourseiterator.next("CourseTest"));
	}

}
