package co.porkopolis.crawler.generators;

import java.util.HashMap;

import co.porkopolis.crawler.dungeon.Tile;
import co.porkopolis.crawler.utils.Location2;

public interface DungeonGenerator {

	public void createDungeon(int width, int height);

	public HashMap<Location2, Tile> returnDungeon();

}
