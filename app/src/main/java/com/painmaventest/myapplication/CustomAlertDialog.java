package com.painmaventest.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.WindowManager;

/**
 * Created by zhangty on 2017/3/3.
 */

public class CustomAlertDialog extends Dialog {
    public CustomAlertDialog(Context context) {
        super(context,R.style.CustomAlertDialog);
        init(context);
    }

    private void init(Context context) {
        WindowManager wm= (WindowManager) context.getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        int width = (int) (wm.getDefaultDisplay().getWidth()*0.7);
        setContentView(R.layout.dialog_alert_content);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        getWindow().setGravity(Gravity.CENTER);
        getWindow().setLayout(width, WindowManager.LayoutParams.WRAP_CONTENT);
    }
}
