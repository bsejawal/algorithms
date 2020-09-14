package design_pattern.observer.postoffice;

public class Person implements Observer {
    String name;

    public Person(String name){
        this.name = name;
    }


    @Override
    public void update(Object o) {

    }
}
