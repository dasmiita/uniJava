public class StockPrices {
    public static void main(String[] args) {
        // 2D array: Each row represents [time, stock value]
        int[][] stockData = {
            {12, 100},  
            {1, 105}, 
            {2, 98},  
            {3, 110}, 
            {4, 102}};
        
        // Print stock values at respective times
        System.out.println("Time\tStock Value");
        for (int i = 0; i < stockData.length; i++) {
            System.out.println(stockData[i][0] + "\t" + stockData[i][1]);
        }}}
