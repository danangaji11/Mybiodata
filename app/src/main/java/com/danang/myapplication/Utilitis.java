package com.danang.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.prefs.Preferences;

public class Utilitis {
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;

    public void  setPref(Context context, String key, String value) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);
        editor = sp.edit();
        editor.putString(key, value);
        editor.commit();

    }

    public String getPref(Context context, String key) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);
        String value = sp.getString(key, null);
        return value;
    }

    public Boolean isLogin(Context context, String key){
        sp = PreferenceManager.getDefaultSharedPreferences(context);
        String value = sp.getString(key, null);
        return value != null;
    }
}