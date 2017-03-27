package java8;

interface Executable {
	int execute(int a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block....");
		int res = e.execute(10);
		System.out.println("result "+ res);
	}
}

public class App {

	public static void main(String[] args) {

		Runner runner = new Runner();
		runner.run(new Executable() { // anonymous class
			@Override
			public int execute(int a) {
				return 7 + a;
			}
		});

		System.out.println("========================================");
		runner.run((int a) -> a * a); // lamda
																// expression

		System.out.println("========================================");
		runner.run((a) -> {
			System.out.println("Lamda block start here");
			System.out.println("hello from multiline lamda expression");
			return a * a * a;
		});
	}

}
