package com.cubixroot.plugins.customplugin;

import android.content.Context;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CubixRootPlugin")
public class CubixRootPluginPlugin extends Plugin {

    private CubixRootPlugin implementation = new CubixRootPlugin();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void testPluginMethod(PluginCall call) {
//        String value = call.getString("msg");
//
//        JSObject ret = new JSObject();
//        ret.put("value", implementation.echo(value));
//        call.resolve(ret);
        String value = call.getString("msg");
        Context context=this.getActivity().getApplicationContext();
        JSObject ret = new JSObject();
        ret.put("value", implementation.printReceipt(value,context));
        call.resolve(ret);
    }
}
