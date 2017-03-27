package reflectionapi;

public class Presenter {
	
	@PleaseInject
	Boundary boundary;

	@Override
	public String toString() {
		return "Presenter [boundary=" + boundary + "]";
	}
	
	

}
