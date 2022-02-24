package com.luke.yoobeetimetable;

import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Contact extends AppCompatActivity {
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
                setContentView((int) R.layout.contact_dark);
            } else if (themeName.equals("Nexus")) {
                setTheme(R.style.NexusDark);
                TypedValue typedValue2 = new TypedValue();
                getTheme().resolveAttribute(R.attr.colorPrimary, typedValue2, true);
                setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue2.data));
                setContentView((int) R.layout.contact_dark);
            } else if (themeName.equals("Pixel")) {
                setTheme(R.style.PixelDark);
                TypedValue typedValue3 = new TypedValue();
                getTheme().resolveAttribute(R.attr.colorPrimary, typedValue3, true);
                setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue3.data));
                setContentView((int) R.layout.contact_dark);
            }
        } else if (themeName.equals("Yoobee")) {
            setTheme(R.style.Yoobee);
            TypedValue typedValue4 = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorPrimary, typedValue4, true);
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue4.data));
            setContentView((int) R.layout.contact);
        } else if (themeName.equals("Nexus")) {
            setTheme(R.style.Nexus);
            TypedValue typedValue5 = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorPrimary, typedValue5, true);
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue5.data));
            setContentView((int) R.layout.contact);
        } else if (themeName.equals("Pixel")) {
            setTheme(R.style.Pixel);
            TypedValue typedValue6 = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorPrimary, typedValue6, true);
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, typedValue6.data));
            setContentView((int) R.layout.contact);
        }
        super.onCreate(savedInstanceState);
    }

    public void phone(View view) {
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:04 384 9624")));
    }

    public void copy_phone(View view) {
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Phone", "04 384 9624"));
        Toast.makeText(this, "Phone number copied to clipboard", 0).show();
    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, "mailto:sarah.wade@acgedu.com");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void copy_email(View view) {
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Email", "sarah.wade@acgedu.com"));
        Toast.makeText(this, "Email address copied to clipboard", 0).show();
    }

    public void tutor_email(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, "mailto:ava.fairhall@acgedu.com");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void copy_tutor_email(View view) {
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Email", "ava.fairhall@acgedu.com"));
        Toast.makeText(this, "Email address copied to clipboard", 0).show();
    }

    public void address(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.co.nz/maps/place/Yoobee+School+of+Design+-+Design+School+Wellington/@-41.2947587,174.7838681,18z/data=!4m5!3m4!1s0x0:0x41a5eb0416607a6d!8m2!3d-41.295005!4d174.7836198")));
    }

    public void copy_address(View view) {
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Address", "20 Kent Terrace, Wellington"));
        Toast.makeText(this, "Address copied to clipboard", 0).show();
    }
}
