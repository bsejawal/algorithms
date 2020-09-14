package design_pattern.observer.stock;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject{
    private List<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);

    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer "+observers.get(observerIndex+1) + " deleted");
        observers.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(ibmPrice, applePrice, googlePrice);
        }

    }

    public void setIbmPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }
    public void setApplePrice(double newApplePrice){
        this.applePrice = newApplePrice;
        notifyObserver();
    }

    public void setGooglePrice(double newGooglePrice){
        this.googlePrice = newGooglePrice;
        notifyObserver();
    }
}
