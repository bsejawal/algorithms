package reflectionapi;

import java.lang.reflect.Field;

public class MyOwnInjection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class<?> clas = Class.forName("reflectionapi.Presenter");
		Object leftSide = clas.newInstance(); // presenter
		Field[] fields = clas.getDeclaredFields();
		for(Field field : fields){
			PleaseInject annotation = field.getAnnotation(PleaseInject.class);
			if(annotation == null){
				Class<?> type = field.getType();
				Object rightSide = type.newInstance();
				field.set(leftSide, rightSide);
			}
			
		}
		System.out.println(leftSide);
		

	}

}
