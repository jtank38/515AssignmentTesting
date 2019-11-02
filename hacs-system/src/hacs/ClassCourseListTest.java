/**@author Jubanjan Dhar**/
/**@version 2.0**/
package hacs;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

class ClassCourseListTest {
	ClassCourseList courselist = new ClassCourseList();
	
//	file f= new BufferedReader(new FileReader("C:\\Users\\Jubanjan\\eclipse-workspace\\hacs-system\\courseinfor.txt"));	
	
	
	@Test
	void testClassCourseList() {
		System.out.println("CourseList initilised");
	
	}

	@Test
	void testInitializeFromFile() {
		courselist.InitializeFromFile("CourseInfo.txt");
		assertEquals(3,courselist.size());
		
	}

	@Test
	void testFindCourseByCourseName() {
		String courneNameExpected="CSE880";
		courselist.InitializeFromFile("CourseInfo.txt");
		assertEquals(courneNameExpected,courselist.FindCourseByCourseName(courneNameExpected).toString());
	}

}
