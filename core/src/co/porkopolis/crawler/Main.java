package co.porkopolis.crawler;

import com.badlogic.gdx.Game;

import co.porkopolis.crawler.screens.GameScreen;

public class Main extends Game {

	@Override
	public void create() {
		setScreen(new GameScreen());
	}

}
