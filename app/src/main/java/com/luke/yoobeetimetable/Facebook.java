package com.luke.yoobeetimetable;

import android.app.ActivityManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import androidx.appcompat.app.AppCompatActivity;

public class Facebook extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        String themeName = PreferenceManager.getDefaultSharedPreferences(this).getString("theme", "Yoobee");
        if (themeName.equals("Yoobee")) {
            setTheme(R.style.Yoobee);
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue.data));
        } else if (themeName.equals("Nexus")) {
            setTheme(R.style.Nexus);
            TypedValue typedValue2 = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorPrimary, typedValue2, true);
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue2.data));
        } else if (themeName.equals("Pixel")) {
            setTheme(R.style.Pixel);
            TypedValue typedValue3 = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorPrimary, typedValue3, true);
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue3.data));
        }
        super.onCreate(savedInstanceState);
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.facebook.com/groups/173368919831804/")));
    }
}
