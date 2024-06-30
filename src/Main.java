import by.tms.homeWork.converters.Converter;
import by.tms.homeWork.converters.ConverterImp;
import by.tms.homeWork.units.DegFahrenheit;
import by.tms.homeWork.units.Kelvin;
import by.tms.homeWork.units.Units;
import by.tms.homeWork.units.DegCelsius;

public class Main {
    public static void main(String[] args) {
        //Каждая единица измерения отдельный класс который содержит свое имя и значение
        Converter converter = new ConverterImp();
        Units degCelsius = new DegCelsius(40);
        converter.convert(degCelsius);
        Units degFahrenheit = new DegFahrenheit(90);
        converter.convert(degFahrenheit);
        Units kelvin = new Kelvin(100);
        converter.convert(kelvin);
        // после использования метода convert, конвертированная величина содержит значения своих конвертаций
        // конвертированную переменную после конвертации можно достать вот так
        System.out.println(kelvin.fahrenheit);
    }
}