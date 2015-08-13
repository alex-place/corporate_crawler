package co.porkopolis.crawler.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;

import co.porkopolis.crawler.generators.BSPGenerator;

public class GameScreen implements Screen {

	OrthographicCamera camera;
	SpriteBatch batch;
	BSPGenerator generator = new BSPGenerator();

	@Override
	public void show() {
		camera = new OrthographicCamera(16, 9);
		batch = new SpriteBatch();
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(10000f, 1000f, 1000f, 1000f);

		batch.begin();

		batch.setColor(MathUtils.random(), MathUtils.random(), MathUtils.random(), 1);

		batch.end();

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {

	}

}
