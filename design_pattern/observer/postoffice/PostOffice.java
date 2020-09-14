package design_pattern.observer.postoffice;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject{

    private List<Mail> allmail;
    public PostOffice(){
        allmail = new ArrayList<>();
    }
    public void addMail(Mail mail){
        allmail.add(mail);
    }

    @Override
    public void attach(Observer o) {

    }

    @Override
    public void deattach(Observer o) {

    }

    @Override
    public void Notify() {

    }
}
