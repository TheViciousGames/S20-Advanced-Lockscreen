package com.theviciousgames.s20advancedlockscreen;

import android.app.Activity;

import eu.chainfire.libsuperuser.Shell;

public class Tools {
    public static void setRefreshRate(int val) {
        switch (val) {
            case 48:
                Superuser.executeCommandSU(Resources.SCREEN_DEFAULT_MODES_SET_TO_0 + "& " + Resources.SCREEN_HZ_CHANGE_TO_48_MIN + "& " + Resources.SCREEN_HZ_CHANGE_TO_48_PEAK);
                break;

            case 60:
                Superuser.executeCommandSU(Resources.SCREEN_DEFAULT_MODES_SET_TO_0 + "& " + Resources.SCREEN_HZ_CHANGE_TO_60_MIN + "& " + Resources.SCREEN_HZ_CHANGE_TO_60_PEAK);
                break;

            case 96:
                Superuser.executeCommandSU(Resources.SCREEN_DEFAULT_MODES_SET_TO_2 + " & " + Resources.SCREEN_HZ_CHANGE_TO_96_MIN + "& " + Resources.SCREEN_HZ_CHANGE_TO_96_PEAK);
                break;

            case 120:
                Superuser.executeCommandSU(Resources.SCREEN_DEFAULT_MODES_SET_TO_2 + " & " + Resources.SCREEN_HZ_CHANGE_TO_120_MIN + "& " + Resources.SCREEN_HZ_CHANGE_TO_120_PEAK);
                break;
        }
    }
    public static String getRefreshRate() {
        return Superuser.executeCommandSU(Resources.SCREEN_GET_REFRESH_RATE);
    }
    public static void askForRootPermission()
    {
        Shell.SU.available();
    }
}

