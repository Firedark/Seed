package com.firedark.seed.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.firedark.seed.Seed;
import com.firedark.seed.interfaces.AndroidInterface;

public class AndroidLauncher extends AndroidApplication implements AndroidInterface {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new Seed(this), config);
	}

	@Override
	public String translator(String s) {
		int identifier = this.getResources().getIdentifier(s,"string", getPackageName());
		return this.getResources().getString(identifier);
	}
}
