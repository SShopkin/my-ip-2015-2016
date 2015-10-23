package javaBegining;

public class ControlFlowStatements {

	public static void main(String[] args) {
		
				// to automatically create method definition press Ctrl + 1
				forExample();
				ifExample();
			}

			private static void forExample() {
				for (int i = 0; i < 10; i++) {
					// 0 to 9
					System.out.println(i);
				}
			}

			private static void ifExample() {				
				if (true) {
					System.out.println("called");
				}
				
				if (1>2) {
					System.out.println("not called");
				} else {
					System.out.println("called");
				}
	}

}
