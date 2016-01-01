package com.example.aksampath.weatherapplication.weather;

import com.example.aksampath.weatherapplication.R;

/**
 * Created by Akshay on 2015-11-08.
 */
public class Forecast {
    private CurrentWeather mCurrentWeather;
    private HoursWeather[] mHourlyForecast;
    private DailyWeather[] mDailyForecast;

    public CurrentWeather getCurrentWeather() {
        return mCurrentWeather;
    }

    public void setCurrentWeather(CurrentWeather currentWeather) {
        mCurrentWeather = currentWeather;
    }

    public HoursWeather[] getHourlyForecast() {
        return mHourlyForecast;
    }

    public void setHourlyForecast(HoursWeather[] hourlyForecast) {
        mHourlyForecast = hourlyForecast;
    }

    public DailyWeather[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(DailyWeather[] dailyForecast) {
        mDailyForecast = dailyForecast;
    }

    public static int getIconId(String iconString){
        //clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night
        int iconId = R.drawable.clear_day;

        if (iconString.equals("clear-day")){
            iconId = R.drawable.clear_day;
        }
        else if(iconString.equals("clear-night")){
            iconId = R.drawable.clear_night;
        }
        else if(iconString.equals("rain")){
            iconId = R.drawable.rain;
        }
        else if(iconString.equals("snow")){
            iconId = R.drawable.snow;
        }
        else if(iconString.equals("sleet")){
            iconId = R.drawable.sleet;
        }
        else if(iconString.equals("wind")){
            iconId = R.drawable.wind;
        }
        else if(iconString.equals("fog")){
            iconId = R.drawable.fog;
        }
        else if(iconString.equals("cloudy")){
            iconId = R.drawable.cloudy;
        }
        else if(iconString.equals("partly-cloudy-day")){
            iconId = R.drawable.partly_cloudy;
        }
        else{
            iconId = R.drawable.cloudy_night;
        }
        return iconId;

    }
}
