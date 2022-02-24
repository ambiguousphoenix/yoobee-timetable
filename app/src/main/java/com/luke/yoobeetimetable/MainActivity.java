package com.luke.yoobeetimetable;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.appcompat.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        String themeName = pref.getString("theme", "Yoobee");
        String layoutName = pref.getString("layout", "Tiles");
        Boolean darkMode = Boolean.valueOf(pref.getBoolean("dark", false));
        if (darkMode.equals(true)) {
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
        if (layoutName.equals("Tiles")) {
            if (darkMode.equals(true)) {
                super.onCreate(savedInstanceState);
                setContentView((int) R.layout.activity_main_dark);
                return;
            }
            super.onCreate(savedInstanceState);
            setContentView((int) R.layout.activity_main);
        } else if (layoutName.equals("List")) {
            if (darkMode.equals(true)) {
                super.onCreate(savedInstanceState);
                setContentView((int) R.layout.activity_main_list_dark);
                return;
            }
            super.onCreate(savedInstanceState);
            setContentView((int) R.layout.activity_main_list);
        } else if (darkMode.equals(true)) {
            super.onCreate(savedInstanceState);
            setContentView((int) R.layout.activity_main_schedule_dark);
        } else {
            super.onCreate(savedInstanceState);
            setContentView((int) R.layout.activity_main_schedule);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        getMenuInflater().inflate(R.menu.actions, menu);
        if (pref.getBoolean("yoobee", true)) {
            menu.findItem(R.id.yoobee).setVisible(true);
        } else {
            menu.findItem(R.id.yoobee).setVisible(false);
        }
        if (pref.getBoolean("acg", true)) {
            menu.findItem(R.id.acg).setVisible(true);
        } else {
            menu.findItem(R.id.acg).setVisible(false);
        }
        if (pref.getBoolean("facebook_class", true)) {
            menu.findItem(R.id.facebook_class).setVisible(true);
        } else {
            menu.findItem(R.id.facebook_class).setVisible(false);
        }
        if (pref.getBoolean("facebook_media", true)) {
            menu.findItem(R.id.facebook_media).setVisible(true);
        } else {
            menu.findItem(R.id.facebook_media).setVisible(false);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Boolean webview = Boolean.valueOf(PreferenceManager.getDefaultSharedPreferences(this).getBoolean("webview", false));
        switch (item.getItemId()) {
            case R.id.contact /*2131689687*/:
                startActivity(new Intent(this, Contact.class));
                return true;
            case R.id.holidays /*2131689688*/:
                startActivity(new Intent(this, Holidays.class));
                return true;
            case R.id.yoobee /*2131689689*/:
                if (webview.equals(true)) {
                    startActivity(new Intent(this, Yoobee.class));
                } else {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.yoobee.ac.nz")));
                }
                return true;
            case R.id.acg /*2131689690*/:
                if (webview.equals(true)) {
                    startActivity(new Intent(this, MyACG.class));
                } else {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.myacg.org")));
                }
                return true;
            case R.id.facebook_class /*2131689691*/:
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/groups/173368919831804")));
                return true;
            case R.id.facebook_media /*2131689692*/:
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/groups/1305898116114430")));
                return true;
            case R.id.settings /*2131689693*/:
                startActivity(new Intent(this, SettingsActivity.class));
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
