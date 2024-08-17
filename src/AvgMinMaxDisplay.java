public class AvgMinMaxDisplay implements Observer,Display{
    private WeatherData weatherData;
    private float temp;
    private float humidity;
    private float pressure;
    private int count=1;
    private int max_temp=-999999;
    private int min_temp=999999;
    private int avg_temp=0;
    private int sum_temp=0;

    public AvgMinMaxDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("avg_temp_is "+avg_temp+" max_temp_is "+max_temp+" min_temp_is "+min_temp);
    }

    @Override
    public void update() {
        this.temp= weatherData.getTemp();
        sum_temp= (int) (sum_temp+this.temp);
        max_temp= (int) Math.max(this.max_temp,this.temp);
        min_temp= (int) Math.min(this.min_temp,this.temp);
        avg_temp= sum_temp/count;
        count=count+1;
        display();
    }
}
