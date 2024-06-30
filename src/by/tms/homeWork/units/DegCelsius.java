package by.tms.homeWork.units;

public class DegCelsius extends Units {
    public DegCelsius(double _value) {
        name = "Градус Цельсия";
        value = _value;
        valueInKelvin = 273.15 + value;
    }
}
