package hacs;

import java.util.*;

/**
 * Title: HACS Description: CSE870 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 * 
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 * @author mjfindler
*@author Jubanjan Dhar
*@version 2.1**/

public class Solution {
	String theAuthor = "";
	public void setTheAuthor(String theAuthor) {
		this.theAuthor = theAuthor;
	}

	public String getTheAuthor() {
		return theAuthor;
	}

	String SolutionFileName = "";
	
	public void setSolutionFileName(String solutionFileName) {
		SolutionFileName = solutionFileName;
	}

	Date theSubmitData = new Date();
	int theGrade;
	boolean reported = false;

	public Solution() {
	}

	@Override
	public String toString() {
		String string;
		string = theAuthor + "  " + SolutionFileName + " Grade=" + getGradeInt() + "  ";
		if (isReported())
			string += "reported";
		else
			string += "not reported";

		return (string);
	}

	String getGradeString() {
		if (isReported())
			return "" + theGrade;
		else
			return "-1";
	}

	int getGradeInt() {
		return theGrade;
	}

	public void setReported(boolean reported) {
		this.reported = reported;
	}

	public boolean isReported() {
		return reported;
	}
}