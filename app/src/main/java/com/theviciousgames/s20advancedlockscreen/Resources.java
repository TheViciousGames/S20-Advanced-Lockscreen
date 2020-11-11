package com.theviciousgames.s20advancedlockscreen;

public class Resources {
    public static final String SCREEN_HZ_CHANGE_TO_48_MIN = "settings put system min_refresh_rate 48.0 ";
    public static final String SCREEN_HZ_CHANGE_TO_48_PEAK = "settings put system peak_refresh_rate 48.0 ";
    public static final String SCREEN_HZ_CHANGE_TO_60_MIN = "settings put system min_refresh_rate 60.0 ";
    public static final String SCREEN_HZ_CHANGE_TO_60_PEAK = "settings put system peak_refresh_rate 60.0 ";
    public static final String SCREEN_HZ_CHANGE_TO_96_MIN = "settings put system min_refresh_rate 96.0 ";
    public static final String SCREEN_HZ_CHANGE_TO_96_PEAK = "settings put system peak_refresh_rate 96.0 ";
    public static final String SCREEN_HZ_CHANGE_TO_120_MIN = "settings put system min_refresh_rate 120.0 ";
    public static final String SCREEN_HZ_CHANGE_TO_120_PEAK = "settings put system peak_refresh_rate 120.0 ";

    public static final String SCREEN_RESOLUTION_CHANGE_TO_HD = "wm size 720x1600 & wm density 300 ";
    public static final String SCREEN_RESOLUTION_CHANGE_TO_FHD = "wm size 1080x2400 & wm density 450 ";
    public static final String SCREEN_RESOLUTION_CHANGE_TO_WQHD = "wm size 1440x3200 & wm density 600 ";

    public static final String SCREEN_GET_REFRESH_RATE="settings get system peak_refresh_rate";

    public static final String SCREEN_DEFAULT_MODES_SET_TO_0 = "settings put secure refresh_rate_mode 0 ";
    public static final String SCREEN_DEFAULT_MODES_SET_TO_2 = "settings put secure refresh_rate_mode 2 ";
}
