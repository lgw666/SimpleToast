package com.gavinrowe.lgw.simpletoast;


import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/**
 * 简单Toast
 * 防止多次弹出时间重叠
 *
 * @author Luo Guowen Email:<a href="#">luoguowen123@qq.com</a>
 * @version 2017-3-16
 */
public class SimpleToast {
    private static Handler handler = new Handler(Looper.getMainLooper());
    private static Toast toast = null;


    /**
     * Toast发送消息
     *
     * @param msg 消息
     */
    public static void show(Context context, String msg) {
        showMessage(context, msg, Toast.LENGTH_SHORT);
    }

    /**
     * Toast发送消息
     *
     * @param msg 消息
     * @param len 时长
     */
    private static void showMessage(final Context context, final String msg, final int len) {
        if (toast != null) {
            toast.cancel();
            toast.setText(msg);
            toast.setDuration(len);
        } else {
            toast = Toast.makeText(context, msg, len);
        }
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.show();
            }
        }, 200);
    }

    /**
     * 关闭当前Toast
     */
    public static void cancelCurrentToast() {
        if (toast != null) {
            toast.cancel();
        }
    }

}