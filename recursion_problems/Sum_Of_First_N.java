package recursion_problems;

//using functions
public class Sum_Of_First_N {
	static int func(int n) {

		// Base Condition.
		if (n == 0) {

			return 0;
		}

		// Problem broken down into 2 parts and then combined.
		return n + func(n - 1);

	}
	// 3+n-1;
	// 2+n-1;
	// 1+n-1;
	// 0-now it will return to the previous stage
	// 1+0;
	// 2+1;
	// 3+3; so the final answer will be '6'.

	public static void main(String[] args) {

		// Here, let’s take the value of n to be 3.
		int n = 3;
		System.out.println(func(n));
	}
}

//using recursion

//class Recursion {
//    
//    static void func(int i, int sum){
//        
//            // Base Condition.
//            if(i<1){
//                
//                System.out.println(sum);
//                return;
//            }
//            
//            // Function call to increment sum by i till i decrements to 1.
//            func(i-1,sum+i);
//            
//
//    }
//    public static void main(String[] args) {
//
//       // Here, let’s take the value of n to be 3.
//       int n = 3;
//       func(n,0);
//    }
//}
