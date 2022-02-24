package com.luke.yoobeetimetable;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;

public class SettingsFragment extends PreferenceFragment {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
        findPreference("theme").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object newVal) {
                SettingsFragment.this.getActivity().recreate();
                return true;
            }
        });
        findPreference("dark").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object newVal) {
                SettingsFragment.this.getActivity().recreate();
                return true;
            }
        });
    }
}
