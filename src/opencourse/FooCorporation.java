package opencourse;

 class FooCorporation {
	 static void method (double basePay, int hoursWorked) {
		 double totalPay;
		 
		 if (basePay < 8.00) {
			 System.out.println("Error: The base pay is too low.");
		 } else if (hoursWorked > 60) {
			 System.out.println("Error: The number of hours worked is too high.");
		 } else {
			 if (hoursWorked < 40) {
				 totalPay = basePay * hoursWorked;
				 System.out.println("The total pay is $" + totalPay);
			 } else {
				 totalPay = (basePay * 40) + (basePay * 1.5)*(hoursWorked - 40);
				 System.out.println("The total pay is $" + totalPay);
			 }
		 }
	 }
	 
	 public static void main(String[] args) {
		method (7.50, 35);
		method (8.20, 47);
		method (10.00, 73);
	}
}
