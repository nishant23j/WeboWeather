package com.nishant.weboweather;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by nishant on 3/25/2016.
 */
public class TypeFaceManager {
    private static Context context=MyApplication.getAppContext();
    private static String Bold="fonts/OpenSans-Bold.ttf";
    private static String Regular="fonts/OpenSans-Light.ttf";
    private static String Light="fonts/OpenSans-Regular.ttf";

    public static Typeface getBold(){
        return Typeface.createFromAsset(context.getAssets(),Bold);
    }
    public static Typeface getRegular(){
        return Typeface.createFromAsset(context.getAssets(),Regular);
    }
    public static Typeface getLight(){
        return Typeface.createFromAsset(context.getAssets(),Light);
    }
}
