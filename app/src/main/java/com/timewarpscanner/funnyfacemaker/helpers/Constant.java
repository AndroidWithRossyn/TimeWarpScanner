package com.timewarpscanner.funnyfacemaker.helpers;


import android.os.Environment;

import java.io.File;

public class Constant {
    public static float speed = 1;
    public static final String MEDIA_FOLDER = (Environment.getExternalStorageDirectory().toString() + File.separator + "TIME WARP" + File.separator);
    public static boolean isPremiumUser = false;
}
