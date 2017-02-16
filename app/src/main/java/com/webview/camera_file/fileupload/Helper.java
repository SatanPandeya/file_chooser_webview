package com.webview.camera_file.fileupload;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by wolfmatrix on 2/16/17.
 */

public class Helper {
    static boolean isNetworkConnected(Context context) {
        final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }
}
