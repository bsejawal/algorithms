package design_pattern.observer.youtube;

public class MainYoutube {
    public static void main(String[] args) {

        Channel localStyleFood = new Channel();

        Subscriber s1 = new Subscriber("Ram");
        Subscriber s2 = new Subscriber("Shyam");
        Subscriber s3 = new Subscriber("Hari");
        Subscriber s4 = new Subscriber("Gita");
        Subscriber s5 = new Subscriber("Sita");
        localStyleFood.subscribe(s1);
        localStyleFood.subscribe(s2);
        localStyleFood.subscribe(s3);
        localStyleFood.subscribe(s4);
        localStyleFood.subscribe(s5);
        s1.subscribeChannel(localStyleFood);
        s2.subscribeChannel(localStyleFood);
        s3.subscribeChannel(localStyleFood);
        s4.subscribeChannel(localStyleFood);
        s5.subscribeChannel(localStyleFood);
        localStyleFood.upload("Yummy Food");

    }
}
