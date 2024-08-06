package com.cubixroot.plugins.customplugin;

import android.content.Context;
import android.util.Log;

import com.mobiiot.androidqapi.api.CsPrinter;
import com.mobiiot.androidqapi.api.MobiiotAPI;

import org.json.JSONObject;

public class CubixRootPlugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public String printReceipt(String value, Context context) {

        new MobiiotAPI(context);


        CsPrinter printer=new CsPrinter();


        try {

            JSONObject receipt_obj = new JSONObject(value);

            StringBuilder companyInfo = new StringBuilder();
            companyInfo.append("\n"+receipt_obj.getString("company")+"\n");
            companyInfo.append("\n"+receipt_obj.getString("address")+"\n");
            companyInfo.append(receipt_obj.getString("email")+"\n");
            companyInfo.append(receipt_obj.getString("contact")+"\n");
            companyInfo.append(receipt_obj.getString("other_info")+"\n");
            String line = "--------------------------------";

            printer.printText_FullParm(companyInfo.toString(), 0, 0, 3, 1, true, false);
            printer.printText(line);

            StringBuilder item_headers = new StringBuilder();
            item_headers.append("ITEM       QTY  PRICE   AMOUNT");
            item_headers.append("\n--------------------------------" + "\n");
            printer.printText(item_headers.toString());



            printer.printText_font("CASHIER: "+receipt_obj.getString("cashier").toUpperCase()+"\n",10);
            printer.printText_font("DATETIME: "+receipt_obj.getString("datetime").toUpperCase()+"\n",10);


        }catch (Exception e){}

//        printer.print(context);

        return value;
    }
}
