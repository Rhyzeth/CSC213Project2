package edu.canisius.csc213.project2.quotes;

public class StockQuote {
    private String symbol;
    private double closePrice;
    private double highestPrice;
    private double lowestPrice; 
    private int transactions;
    private double openPrice; 
    private long timeStamp;
    private double tradingVolume;

    public StockQuote(
        String symbol, 
        double closePrice, 
        double highestPrice, 
        double lowestPrice, 
        int transactions, 
        double openPrice, 
        long timeStamp,
        double tradingVolume) {
        this.symbol = symbol;
        this.closePrice = closePrice;
        this.highestPrice = highestPrice;
        this.lowestPrice = lowestPrice;
        this.transactions = transactions;
        this.openPrice = openPrice;
        this.timeStamp = timeStamp;
        this.tradingVolume = tradingVolume;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getClosePrice() {
        return closePrice;
    }

    public double getHighestPrice() {
        return highestPrice;
    }

    public double getLowestPrice() {
        return lowestPrice;
    }

    public double getOpenPrice() {
        return openPrice;
    }

    public Object getNumberOfTransactions() {
        return transactions;
    }

    public double getTradingVolume() {
        return tradingVolume;
    }

    public Object getTimestamp() {
        return timeStamp;
    }

    public String prettyPrint() {
        return "Symbol: " + symbol + "\n" +
        "Close Price: " + closePrice + "\n" +
        "Highest Price: " + highestPrice + "\n" +
        "Lowest Price: " + lowestPrice + "\n" +
        "Number of Transactions: " + transactions + "\n" +
        "Open Price: " + openPrice + "\n" +
        "Trading Volume: " + tradingVolume + "\n";
    }
}
