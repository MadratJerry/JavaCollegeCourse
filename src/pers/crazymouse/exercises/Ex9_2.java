package pers.crazymouse.exercises;

public class Ex9_2 {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setPreviousClosingPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println(stock1.getChangePercent());
    }
}

class Stock {
    private String _symbal;
    private String _name;
    private double _previousClosingPrice;
    private double _currentPrice;

    Stock(String symbal, String name) {
        _symbal = symbal;
        _name = name;
    }

    public double getChangePercent() {
        return (_currentPrice - _previousClosingPrice) / _previousClosingPrice * 100;
    }

    public String getSymbal() {
        return _symbal;
    }

    public String getName() {
        return _name;
    }

    public void setPreviousClosingPrice(double x) {
        _previousClosingPrice = x;
    }

    public void setCurrentPrice(double x) {
        _currentPrice = x;
    }

    public double getPreviousClosingPrice() {
        return _previousClosingPrice;
    }

    public double getCurrentPrice() {
        return _currentPrice;
    }
}
