package com.luke.yoobeetimetable;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SettingsActivity extends AppCompatActivity {
    public static final int RESULT_CODE_THEME_UPDATED = 1;
    Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        String themeName = pref.getString("theme", "Yoobee");
        if (Boolean.valueOf(pref.getBoolean("dark", false)).equals(true)) {
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
        setContentView(R.layout.toolbar);
        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.toolbar.setTitle((CharSequence) "Settings");
        setSupportActionBar(this.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SettingsActivity.this.onBackPressed();
            }
        });
        getFragmentManager().beginTransaction().replace(R.id.fragment_container, new SettingsFragment()).commit();
    }

    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
