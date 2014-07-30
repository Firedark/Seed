package com.firedark.seed.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.firedark.seed.Seed;
import com.firedark.seed.interfaces.AndroidInterface;

public class DesktopLauncher implements AndroidInterface {
	private static DesktopLauncher application;
	
	public static void main (String[] arg) {
		
		if(application == null){
			application = new DesktopLauncher();
		}
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = "Seed";
		config.useGL30 = false;
		config.width = 800;
		config.height = 480;
		
		new LwjglApplication(new Seed(application), config);
	}

	@Override
	public String translator(String s) {
		
		return null;
	}
}
