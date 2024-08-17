//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        AvgMinMaxDisplay avgMinMaxDisplay = new AvgMinMaxDisplay(weatherData);
        weatherData.setMeasurements(80,75,30);
        weatherData.setMeasurements(60,65,40);
        weatherData.setMeasurements(70,45,25);
    }
}