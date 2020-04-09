package testcases;

import utility.TimeStampUtility;

public class timestamptest {
public static void main(String[] args) {
	
	TimeStampUtility util=new TimeStampUtility();
	
	String stamp=util.getCurrentTimestamp();
	System.out.println(stamp);
}
}
