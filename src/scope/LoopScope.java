package scope;

public class LoopScope {
	public static void main(String[] args) {
		
		// For Loop
		// x is declared in the for loop; only accessible in the for loop
		for(int x = 0; x < 5; x++) {
			System.out.println("X Loop " + x);
		}
		
		// For Loop
		// y is declared in the method; may be accessed anywhere in the method
		int y;
		for(y = 0; y < 5; y++) {
			System.out.println("Y Loop " + y);
		}
		
		System.out.println("Y = " + y);
		
	}
}
