package com.zxon.angyourlocker;

import android.util.Log;

public class LogUtil {
    private static final String TAG = "locker_debug";
    
    public static void d(String s){
        Log.d(TAG, s);
    }
}
