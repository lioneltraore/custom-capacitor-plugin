package com.cubixroot.plugins.customplugin;

import android.util.Log;

public class CubixRootPlugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
