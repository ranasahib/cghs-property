package com.cghs.commons;

import java.util.Date;

public class DateProvider {
    private static DateProvider dateProvider = new DateProvider();

    public static Date get() {
        return dateProvider.getCurrentDate();
    }

    public Date getCurrentDate() {
        return new Date();
    }

    public static void setDateProvider(DateProvider dateProvider) {
        DateProvider.dateProvider = dateProvider;
    }
}
