package com.luke.yoobeetimetable;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.appcompat.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;

public class Holidays extends AppCompatActivity {
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
                setContentView((int) R.layout.holidays_dark);
            } else if (themeName.equals("Nexus")) {
                setTheme(R.style.NexusDark);
                TypedValue typedValue2 = new TypedValue();
                getTheme().resolveAttribute(R.attr.colorPrimary, typedValue2, true);
                setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue2.data));
                setContentView((int) R.layout.holidays_dark);
            } else if (themeName.equals("Pixel")) {
                setTheme(R.style.PixelDark);
                TypedValue typedValue3 = new TypedValue();
                getTheme().resolveAttribute(R.attr.colorPrimary, typedValue3, true);
                setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue3.data));
                setContentView((int) R.layout.holidays_dark);
            }
        } else if (themeName.equals("Yoobee")) {
            setTheme(R.style.Yoobee);
            TypedValue typedValue4 = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorPrimary, typedValue4, true);
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue4.data));
            setContentView((int) R.layout.holidays);
        } else if (themeName.equals("Nexus")) {
            setTheme(R.style.Nexus);
            TypedValue typedValue5 = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorPrimary, typedValue5, true);
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue5.data));
            setContentView((int) R.layout.holidays);
        } else if (themeName.equals("Pixel")) {
            setTheme(R.style.Pixel);
            TypedValue typedValue6 = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorPrimary, typedValue6, true);
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue6.data));
            setContentView((int) R.layout.holidays);
        }
        super.onCreate(savedInstanceState);
    }

    public void january(View view) {
        View january_detail = findViewById(R.id.january_detail);
        if (january_detail.getVisibility() == View.VISIBLE) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new DecelerateInterpolator());
            rotateAnimation.setRepeatCount(0);
            rotateAnimation.setDuration(250);
            rotateAnimation.setFillAfter(true);
            findViewById(R.id.arrow1).startAnimation(rotateAnimation);
            january_detail.setVisibility(View.GONE);
            return;
        }
        RotateAnimation rotateAnimation2 = new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setInterpolator(new DecelerateInterpolator());
        rotateAnimation2.setRepeatCount(0);
        rotateAnimation2.setDuration(250);
        rotateAnimation2.setFillAfter(true);
        findViewById(R.id.arrow1).startAnimation(rotateAnimation2);
        january_detail.setVisibility(View.VISIBLE);
    }

    public void february(View view) {
        View february_detail = findViewById(R.id.february_detail);
        if (february_detail.getVisibility() == View.VISIBLE) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new DecelerateInterpolator());
            rotateAnimation.setRepeatCount(0);
            rotateAnimation.setDuration(250);
            rotateAnimation.setFillAfter(true);
            findViewById(R.id.arrow2).startAnimation(rotateAnimation);
            february_detail.setVisibility(View.GONE);
            return;
        }
        RotateAnimation rotateAnimation2 = new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setInterpolator(new DecelerateInterpolator());
        rotateAnimation2.setRepeatCount(0);
        rotateAnimation2.setDuration(250);
        rotateAnimation2.setFillAfter(true);
        findViewById(R.id.arrow2).startAnimation(rotateAnimation2);
        february_detail.setVisibility(View.VISIBLE);
    }

    public void april(View view) {
        View april_detail = findViewById(R.id.april_detail);
        if (april_detail.getVisibility() == View.VISIBLE) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new DecelerateInterpolator());
            rotateAnimation.setRepeatCount(0);
            rotateAnimation.setDuration(250);
            rotateAnimation.setFillAfter(true);
            findViewById(R.id.arrow4).startAnimation(rotateAnimation);
            april_detail.setVisibility(View.GONE);
            return;
        }
        RotateAnimation rotateAnimation2 = new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setInterpolator(new DecelerateInterpolator());
        rotateAnimation2.setRepeatCount(0);
        rotateAnimation2.setDuration(250);
        rotateAnimation2.setFillAfter(true);
        findViewById(R.id.arrow4).startAnimation(rotateAnimation2);
        april_detail.setVisibility(View.VISIBLE);
    }

    public void june(View view) {
        View june_detail = findViewById(R.id.june_detail);
        if (june_detail.getVisibility() == View.VISIBLE) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new DecelerateInterpolator());
            rotateAnimation.setRepeatCount(0);
            rotateAnimation.setDuration(250);
            rotateAnimation.setFillAfter(true);
            findViewById(R.id.arrow6).startAnimation(rotateAnimation);
            june_detail.setVisibility(View.GONE);
            return;
        }
        RotateAnimation rotateAnimation2 = new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setInterpolator(new DecelerateInterpolator());
        rotateAnimation2.setRepeatCount(0);
        rotateAnimation2.setDuration(250);
        rotateAnimation2.setFillAfter(true);
        findViewById(R.id.arrow6).startAnimation(rotateAnimation2);
        june_detail.setVisibility(View.VISIBLE);
    }

    public void july(View view) {
        View july_detail = findViewById(R.id.july_detail);
        if (july_detail.getVisibility() == View.VISIBLE) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new DecelerateInterpolator());
            rotateAnimation.setRepeatCount(0);
            rotateAnimation.setDuration(250);
            rotateAnimation.setFillAfter(true);
            findViewById(R.id.arrow7).startAnimation(rotateAnimation);
            july_detail.setVisibility(View.GONE);
            return;
        }
        RotateAnimation rotateAnimation2 = new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setInterpolator(new DecelerateInterpolator());
        rotateAnimation2.setRepeatCount(0);
        rotateAnimation2.setDuration(250);
        rotateAnimation2.setFillAfter(true);
        findViewById(R.id.arrow7).startAnimation(rotateAnimation2);
        july_detail.setVisibility(View.VISIBLE);
    }

    public void october(View view) {
        View october_detail = findViewById(R.id.october_detail);
        if (october_detail.getVisibility() == View.VISIBLE) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new DecelerateInterpolator());
            rotateAnimation.setRepeatCount(0);
            rotateAnimation.setDuration(250);
            rotateAnimation.setFillAfter(true);
            findViewById(R.id.arrow10).startAnimation(rotateAnimation);
            october_detail.setVisibility(View.GONE);
            return;
        }
        RotateAnimation rotateAnimation2 = new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setInterpolator(new DecelerateInterpolator());
        rotateAnimation2.setRepeatCount(0);
        rotateAnimation2.setDuration(250);
        rotateAnimation2.setFillAfter(true);
        findViewById(R.id.arrow10).startAnimation(rotateAnimation2);
        october_detail.setVisibility(View.VISIBLE);
    }
}
