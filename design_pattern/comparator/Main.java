package design_pattern.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = new ArrayList<>();
		list.add(new Student("firstName3", "lastName3", 25));
		list.add(new Student("firstName1", "lastName2", 25));
		list.add(new Student("firstName4", "lastName1", 25));
		list.add(new Student("firstName2", "lastName4", 25));

		System.out.println("before sort");
		list.forEach(System.out::println);

		// implementing Comparator interface in StudentComparator class
		 Collections.sort(list, new StudentComparator());

		// implementing annonymous class
	/*	Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}

		});*/
		 
		 

		System.out.println("after");
		list.forEach(System.out::println);

	}

}
