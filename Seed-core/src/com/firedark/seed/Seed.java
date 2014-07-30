package com.firedark.seed;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.firedark.seed.interfaces.AndroidInterface;
import com.firedark.seed.managers.MyAssetManager;
import com.firedark.seed.screens.GameScreen;

public class Seed extends Game {
	SpriteBatch batch;
	
	public AndroidInterface AI;
	public MyAssetManager assetManager;
	public GameScreen gameScreen;
	public Seed(AndroidInterface AI){
		this.AI = AI;
		assetManager = new MyAssetManager();
	}
	
	
	@Override
	public void create () {
		gameScreen= new GameScreen(this);
		this.setScreen(gameScreen);
		System.out.println(AI.translator("app_name"));
	}

	
	

}
