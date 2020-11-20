package com.theviciousgames.s20advancedlockscreen;

public class Tools {
    public static void setRefreshRate(int val) {
        switch (val) {
            case 48:
                Superuser.executeCommandSU(Resources.SCREEN_DEFAULT_MODES_SET_TO_0 + "& " + Resources.SCREEN_HZ_CHANGE_TO_48_MIN + "& " + Resources.SCREEN_HZ_CHANGE_TO_48_PEAK);
                break;
            case 120:
                Superuser.executeCommandSU(Resources.SCREEN_DEFAULT_MODES_SET_TO_2 + " & " + Resources.SCREEN_HZ_CHANGE_TO_120_MIN + "& " + Resources.SCREEN_HZ_CHANGE_TO_120_PEAK);
                break;
        }
    }
}

