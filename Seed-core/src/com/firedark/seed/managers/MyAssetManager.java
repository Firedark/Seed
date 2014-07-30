package com.firedark.seed.managers;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class MyAssetManager {
public AssetManager assets;

public MyAssetManager(){
	assets = new AssetManager();
}

public void loadImages(){
	assets.load("badlogic.jpg", Texture.class);
}
}
