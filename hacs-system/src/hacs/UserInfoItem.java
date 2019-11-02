package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * 
*@author Jubanjan Dhar
*@version 2.1**/

public class UserInfoItem {

	public enum USER_TYPE { Student, Instructor }
	
	String strUserName;
	USER_TYPE UserType; // 0 : Student, 1: Instructor
}