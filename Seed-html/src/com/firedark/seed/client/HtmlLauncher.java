package com.firedark.seed.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.firedark.seed.Seed;
import com.firedark.seed.interfaces.AndroidInterface;

public class HtmlLauncher extends GwtApplication implements AndroidInterface {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(480, 320);
        }

        @Override
        public ApplicationListener getApplicationListener () {
                return new Seed(this);
        }

		@Override
		public String translator(String s) {
			// TODO Auto-generated method stub
			return null;
		}
}