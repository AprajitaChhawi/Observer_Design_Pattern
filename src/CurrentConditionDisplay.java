public class CurrentConditionDisplay implements Observer,Display{
    private WeatherData weatherData;
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temp is "+temp+" humidity is "+humidity+" pressure is "+pressure);
    }

    @Override
    public void update() {
        this.temp= weatherData.getTemp();
        this.humidity= weatherData.getHumidity();
        this.pressure= weatherData.getPressure();
        display();
    }
}
