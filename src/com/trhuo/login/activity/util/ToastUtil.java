package com.trhuo.login.activity.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Toastπ§æﬂ¿‡
 * @author trh
 *
 */
public class ToastUtil {
	
	public static void toastLong(Context context,String text){
		Toast.makeText(context, text, Toast.LENGTH_LONG).show();
	}
	
	public static void toastShort(Context context,String text){
		Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
	}
	
}
