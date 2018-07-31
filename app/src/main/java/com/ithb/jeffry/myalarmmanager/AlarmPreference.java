package com.ithb.jeffry.myalarmmanager;

import android.content.Context;
import android.content.SharedPreferences;

public class AlarmPreference {
    private final String PREF_NAME = "AlarmPreference";
    private final String KEY_ONE_TIME_DATE = "oneTimeDate";
    private final String KEY_ONE_TIME_TIME = "oneTimeTime";
    private final String KEY_ONE_TIME_MESSAGE = "oneTimeMessage";
    private final String KEY_REPEATING_TIME = "repeatingTime";
    private final String KEY_REPEATING_MESSAGE = "repeatingMessage";
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor editor;

    public AlarmPreference(Context context){
        mSharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = mSharedPreferences.edit();
    }

    public void setOneTimeDate(String date){
        editor.putString(KEY_ONE_TIME_DATE, date);
        editor.commit();
    }

    public String getOneTimeDate(){
        return mSharedPreferences.getString(KEY_ONE_TIME_DATE, null);
    }

    public void clear(){
        editor.clear();
        editor.commit();
    }
}
