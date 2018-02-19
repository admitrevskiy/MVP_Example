package com.example.mvp_example;

import android.util.Log;


/**
 * Created by pusya on 19.02.18.
 */

public class MainRepository implements MainContract.Repository {

    private static final String TAG = "MainRepository";
    @Override
    public String loadMessage() {
        Log.d(TAG, "loadMessage()");
        /** Здесь обращаемся к БД
         * Я специально ничего не пишу, чтобы не загромождать пример
         * DBHelper'ами и прочими не относяшимеся к теме объектами.
         * Поэтому я буду возвращать строку Сосисочная =)
         */
        return "Сосисочная у Лёхи";
    }
}
