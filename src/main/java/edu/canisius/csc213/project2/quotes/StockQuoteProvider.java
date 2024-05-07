package edu.canisius.csc213.project2.quotes;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface StockQuoteProvider {
    /*
     * The method is expected to return a well formed URL to contact a quote provider.
     * For example, if you provided:
     * 
     * symbol - AAPL
     * date   - 2023-01-09
     * key    - p37b6Gmz63wkNVVlxjj5mxconf7Pjy5X
     * 
     * It would reply with: 
     * https://api.polygon.io/v2/aggs/ticker/AAPL/range/1/day/2023-01-09/2023-01-09?apiKey=p37b6Gmz63wkNVVlxjj5mxconf7Pjy5X
     */
    public default String getEndpointUrl(String symbolName, String date, String apiKey) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateFormat.setLenient(false);
            Date parsedDate = dateFormat.parse(date);
            @SuppressWarnings("unused")
            String formattedDate = dateFormat.format(parsedDate);
            return "https://api.polygon.io/v2/aggs/ticker/" + symbolName + "/range/1/day/" + date + "/" + date + "?apiKey=" + apiKey;
        }
        catch (ParseException e){
            throw new IllegalArgumentException("Invalid date format");
        }
    }
  
    /*
     * This takes a well formed endpoint URL (what is returned by getEndpointUrl)
     * and then returns a StockQuote object.
     */
    public StockQuote getStockQuote(String endpointUrl) throws IOException;
}
