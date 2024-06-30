package by.tms.homeWork.units;

public class DegFahrenheit extends Units {
    public DegFahrenheit(double _value) {
        name = "Градус Фаренгейта";
        value = _value;
        valueInKelvin = (value+459.67)*(5/9d);
    }
}
