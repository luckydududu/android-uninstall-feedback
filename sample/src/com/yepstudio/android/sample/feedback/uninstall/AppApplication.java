package com.yepstudio.android.sample.feedback.uninstall;

import com.yepstudio.android.library.feedback.uninstall.AppUninstall;

import android.app.Application;

public class AppApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		AppUninstall.openUrlWhenUninstall(this, "http://www.google.com");
	}

}
