package by.tms.homeWork.converters;

import by.tms.homeWork.units.Units;

public class ConverterImp implements Converter {
public abstract static class Data {
   public double celsius;
    public double fahrenheit;
    public double kelvin;
}
    public int convert(Units unit) {
     switch (unit.name){
         case "Градус Цельсия":
             System.out.println("Результат конвертации Градуса Цельсия : " );
             unit.celsius = unit.value;
             unit.kelvin = unit.valueInKelvin;
             unit.fahrenheit = (unit.kelvin-273.15)*1.8+32;
             System.out.println("Градусы Цельсия = "+unit.celsius);
             System.out.println("Градусы Фаренгейта = "+unit.fahrenheit);
             System.out.println("Кельвины = "+unit.kelvin);
             break;
         case "Градус Фаренгейта":
             System.out.println("Результат конвертации Градусa Фаренгейта : " );
             unit.fahrenheit = unit.value;
             unit.kelvin = unit.valueInKelvin;
             unit.celsius = unit.kelvin-273.15;
             System.out.println("Градусы Фаренгейта = "+unit.fahrenheit);
             System.out.println("Кельвины = "+unit.kelvin);
             System.out.println("Градусы Цельсия = "+unit.celsius);
             break;
         case "Кельвин":
             System.out.println("Результат конвертации Кельвина : " );
             unit.kelvin = unit.value;
             unit.celsius = unit.kelvin-273.15;
             unit.fahrenheit = (unit.kelvin-273.15)*1.8+32;
             System.out.println("Кельвины = "+unit.kelvin);
             System.out.println("Градусы Цельсия = "+unit.celsius);
             System.out.println("Градусы Фаренгейта = "+unit.fahrenheit);
             break;
     }

        return 0;
    }
}
