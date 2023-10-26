package test;

public class A5 {

	public static void main(String[] args) {
		int[] a = { 12, 18, 20, 38, 53, 93, 77, 61, 59, 56 };
		int[] y = { 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010 };
		// int year=y[0]!= ? y[0]:y[1];
		 int year=0;
		for (int i = 1; i < a.length; i++) {
				if (a[i] < a[i-1]) {
					year=i;
					break;
				}
			}
		
		System.out.println(2001+year);
	}
}