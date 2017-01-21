package java8;

interface Executable {
	void execute();
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block....");
		e.execute();
	}
}

public class App {

	public static void main(String[] args) {

		Runner runner = new Runner();
		runner.run(new Executable() { // anonymous class
			@Override
			public void execute() {
				System.out.println("hello there");

			}
		});
		
		System.out.println("========================================");
		runner.run(() -> System.out.println("Hello fron inline")); // lamda expression
		
		System.out.println("========================================");
		runner.run(() -> 
		{
			System.out.println("Lamda block start here");
			System.out.println("hello from multiline lamda expression");
		});

	}

}
