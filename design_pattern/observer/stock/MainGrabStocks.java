package design_pattern.observer.stock;

public class MainGrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.0);
        stockGrabber.setApplePrice(113.0);
        stockGrabber.setGooglePrice(1200.0);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.0);
        stockGrabber.setApplePrice(113.0);
        stockGrabber.setGooglePrice(1200.0);

        stockGrabber.unregister(observer1);
        stockGrabber.setGooglePrice(88.0);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.0);
        Runnable getAPPLE = new GetTheStock(stockGrabber, 2, "APPLE", 200.0);
        Runnable getGOOGLE = new GetTheStock(stockGrabber, 2, "GOOGLE", 1200.0);
        new Thread(getIBM).start();
        new Thread(getAPPLE).start();
        new Thread(getGOOGLE).start();

    }
}
