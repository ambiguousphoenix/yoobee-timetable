package com.luke.yoobeetimetable;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.appcompat.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyACG extends AppCompatActivity {
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
        WebView webview = new WebView(this);
        setContentView((View) webview);
        webview.loadUrl("https://www.myacg.org");
        webview.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView webview, String url) {
                webview.loadUrl(url);
                return true;
            }
        });
    }
}
