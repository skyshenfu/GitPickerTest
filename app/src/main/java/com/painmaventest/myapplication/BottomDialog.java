package com.painmaventest.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.WindowManager;

/**
 * Created by zhangty on 2017/3/3.
 */

public class BottomDialog extends Dialog {
    private WindowManager.LayoutParams mParams;
    public BottomDialog(Context context) {
        super(context,R.style.BottomDialog);
        init(context);
    }

    private void init(Context context) {
        WindowManager wm= (WindowManager) context.getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        int width = wm.getDefaultDisplay().getWidth();
        int height = wm.getDefaultDisplay().getHeight();
        mParams = new WindowManager.LayoutParams();
        mParams.x= (int) (0.8*width);
        mParams.y=WindowManager.LayoutParams.WRAP_CONTENT;
        setContentView(R.layout.dialog_content);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        getWindow().setGravity(Gravity.BOTTOM);
        getWindow().setLayout(mParams.x, WindowManager.LayoutParams.WRAP_CONTENT);
    }
}
