package defaultconstructor.date;

public class SimpleDateFormatter {
    private CountryCode countryCode;

    public SimpleDateFormatter(){
        countryCode = CountryCode.HU;
    }

    public SimpleDateFormatter(CountryCode countryCode){
        this.countryCode = countryCode;
    }

    public String formatDateString(SimpleDate simpleDate){
        return simpleDate.getYear()+"-"+ simpleDate.getMonth()+"-"+simpleDate.getDay();
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        if (countryCode==CountryCode.HU){
            return simpleDate.getYear()+"-"+simpleDate.getMonth()+"-"+simpleDate.getDay();
        }
        if (countryCode==CountryCode.US){
            return simpleDate.getMonth()+"-"+simpleDate.getDay()+"-"+simpleDate.getYear();
        }
        if (countryCode == CountryCode.EN) {
            return simpleDate.getDay()+"-"+simpleDate.getMonth()+"-"+ simpleDate.getYear();
        }
        return "";
    }
}
