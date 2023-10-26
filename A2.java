package test;

public class A2 {

	public static void main(String[] args) {
		int[] sales = { 125000, 93000, 80000, 75000, 84000, 110000, 105000, 120000, 90000, 115000, 123000, 150000 };
		// Create an array to store quarterly sales data
		int[] quarterlySales = new int[4];

		// Calculate quarterly sales and display monthly, quarterly, and total sales
		for (int i = 0; i < 12; i++) {
			int quarter = i / 3;
			quarterlySales[quarter] += sales[i];
		}
		int totalSales = 0;
		// Display monthly sales
		System.out.println("Monthly Sales:");
		for (int i = 0; i < 12; i++) {
			System.out.printf("%s: %d%n", getMonthName(i), sales[i]);
			totalSales += sales[i];
		}
		// Display quarterly sales
		System.out.println("\nQuarterly Sales:");
		for (int i = 0; i < 4; i++) {
			System.out.printf("Quarter %d: %d%n", i + 1, quarterlySales[i]);
		}
		// Display total sales
		System.out.println("\nTotal Sales: " + totalSales);
	}

	// Helper method to get the month name based on the index
	public static String getMonthName(int month) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return months[month];
	}

}