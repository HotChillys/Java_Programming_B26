package day35_methods;

public class CurrencyConverter {
    public static double currencyConvert(String currency, double amount) {

        switch (currency.toLowerCase().trim()) {
            case "euro" :
                return amount * 0.91;
            case "yen":
                return amount * 121.03;
            case "lira":
               return amount * 14.85;
            case "won":
               return amount * 1217.52;
            case "rupee":
                return amount * 181.45;
            default:
                return 0;
        }

    }
}
