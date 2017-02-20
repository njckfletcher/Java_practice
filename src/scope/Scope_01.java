package scope;

public class Scope_01 {
	// Class-level declaration
	// May be used anywhere inside the class
	// Typically at the top of the class
	private String username;
	
	// MAIN METHOD
	public static void main(String[] args) {
		// Method-level declaration
		// Variable is terminated when method is completed
		int x = 5;
	}
	
	// NEW METHOD
	public void setWord(String word) {
		String correctWord = word;
	}
	
	// CONFLICTING METHOD
	public void setName(String username) {
		this.username = username;
	}
}
