package opencourse;
import java.util.HashMap;
	
	class MathProblem {
		static void findSquares(int sum) {
			int a;
			double b;
			
			for (a = 1; a < Math.sqrt(sum); a++) {
				b = Math.sqrt(sum - a*a);
				if (a*a + (int)b*(int)b == sum) {
					System.out.println(a + "^2 + " + (int)b + "^2 is equal to " + sum);
					return;
				}
			}
			System.out.println("There are no two integers whose squares add up to " + sum);
		}
		
		public static void main(String[] args) {
			findSquares(100);
			findSquares(1111);
			System.out.println(squareChecker(1111));
			System.out.println(primeFactors(123123));
		}
		
		public static HashMap<Integer, Integer> primeFactors(int sum) {
			HashMap<Integer,Integer> primeFactorization = new HashMap<Integer,Integer>();
			int num = sum;
			for (int i = 2; i < num; i++) {
				int x = 0;
				while (num%i == 0) {
					x += 1;
					primeFactorization.put(i, x);
					num = num / i;
				}
			}
			if (num > 2 && num != sum) {
				primeFactorization.put(num, 1);	
			}
			return primeFactorization;
		}
		
		public static boolean squareChecker(int sum) {
			HashMap<Integer,Integer> primeFactors = primeFactors(sum);
			for (int i: primeFactors.keySet()) {
				if ((i % 4 == 3) && (primeFactors.get(i) % 2 == 1)) {
					return false;
				}
			}
			return true;
		}
	}
