/**@author Jubanjan Dhar**/
/**@version 2.1**/
package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacadeTest {
	Facade facade = new Facade();
	@Test
	void testFacade() {
	System.out.println("Facade Class Called");
	}

	@Test
	void testSubmitSolution() {
		Assignment assig =new Assignment();
		Solution sol=new Solution();
		facade.SubmitSolution(assig, sol);
		assertEquals(1,assig.getTheSolutionList().size());
	}

	@Test
	void testRemind() {
	}

	@Test
	void testCreateUser() {
		UserInfoItem userInfoitem= new UserInfoItem();
		userInfoitem.UserType= UserInfoItem.USER_TYPE.Student;
		facade.CreateUser(userInfoitem);
		assertTrue(facade.thePerson instanceof Student);
		
		
	}

	@Test
	void testCreateCourseList() {
		facade.CreateCourseList();
	//	assertEquals(3,facade.theCourseList.size());
	}

	@Test
	void testAttachCourseToUser() {
		UserInfoItem userInfoitem= new UserInfoItem();
		userInfoitem.UserType= UserInfoItem.USER_TYPE.Student;
		userInfoitem.strUserName="pepe";
		facade.CreateUser(userInfoitem);
		facade.CreateCourseList();
		facade.AttachCourseToUser();
		assertEquals(0,facade.thePerson.GetCourseList().size());
	}


}
