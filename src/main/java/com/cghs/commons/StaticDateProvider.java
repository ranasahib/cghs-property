package com.cghs.commons;

import java.util.Date;

public class StaticDateProvider extends DateProvider {

    private Date currentDate;

    public static void initialize(Date currentDate) {
        StaticDateProvider instance = new StaticDateProvider();
        instance.setCurrentDate(currentDate);
        DateProvider.setDateProvider(instance);
    }

    @Override
    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
}
