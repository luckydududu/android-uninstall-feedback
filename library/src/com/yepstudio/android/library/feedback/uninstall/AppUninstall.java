package com.yepstudio.android.library.feedback.uninstall;

import android.content.Context;

public class AppUninstall {

	static {
		System.loadLibrary("feedback-uninstall");
	}

	public static void openUrlWhenUninstall(Context context, String openUrl) {
		String dirStr = context.getApplicationInfo().dataDir;
		String activity = "com.android.browser/com.android.browser.BrowserActivity";
		String action = "android.intent.action.VIEW";
		String data = openUrl;
		onUninstall(dirStr, activity, action, data);
	}
	
	public static void startActionWhenUninstall(Context context, String action, String data) {
		String dirStr = context.getApplicationInfo().dataDir;
		onUninstall(dirStr, null, action, data);
	}
	
	public static void startActivityWhenUninstall(Context context, String packageName, String activityName) {
		String dirStr = context.getApplicationInfo().dataDir;
		onUninstall(dirStr, String.format("%s/%s", packageName, activityName), null, null);
	}

	private static native void onUninstall(String dirStr, String activity, String action, String data);

}
