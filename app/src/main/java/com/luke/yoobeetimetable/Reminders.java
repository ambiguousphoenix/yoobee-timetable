package com.luke.yoobeetimetable;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.appcompat.app.AppCompatActivity;
import android.util.TypedValue;

public class Reminders extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        String themeName = pref.getString("theme", "Yoobee");
        if (pref.getBoolean("dark", true)) {
            if (themeName.equals("Yoobee")) {
                setTheme(R.style.YoobeeDark);
                TypedValue typedValue = new TypedValue();
                getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue.data));
            } else if (themeName.equals("Nexus")) {
                setTheme(R.style.NexusDark);
                TypedValue typedValue2 = new TypedValue();
                getTheme().resolveAttribute(R.attr.colorPrimary, typedValue2, true);
                setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue2.data));
            } else if (themeName.equals("Pixel")) {
                setTheme(R.style.PixelDark);
                TypedValue typedValue3 = new TypedValue();
                getTheme().resolveAttribute(R.attr.colorPrimary, typedValue3, true);
                setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue3.data));
            }
        } else if (themeName.equals("Yoobee")) {
            setTheme(R.style.Yoobee);
            TypedValue typedValue4 = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorPrimary, typedValue4, true);
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue4.data));
        } else if (themeName.equals("Nexus")) {
            setTheme(R.style.Nexus);
            TypedValue typedValue5 = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorPrimary, typedValue5, true);
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue5.data));
        } else if (themeName.equals("Pixel")) {
            setTheme(R.style.Pixel);
            TypedValue typedValue6 = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorPrimary, typedValue6, true);
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue6.data));
        }
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.reminders);
    }
}
