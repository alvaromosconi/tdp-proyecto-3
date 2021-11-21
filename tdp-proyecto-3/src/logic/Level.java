package logic;
import java.util.List;

import entities.Enemy;
import entities.Entity;
import entities.MainCharacter;
import entities.Wall;

public class Level {
	
	private List<Enemy> enemies;
	private List<Wall> walls;
	private List<Entity> components;
	private MainCharacter player;
	private String backgroundUrl; 
	private List<Entity> doorways;

	public Level(List<Enemy> enemies, List<Entity> components, MainCharacter player, List<Wall> walls, String backgroundUrl, List<Entity> doorways) {
		
		this.enemies = enemies;
		this.player = player;
		this.backgroundUrl = backgroundUrl;
		this.walls = walls;
		this.components = components;
		this.doorways = doorways;
	}

	public String getBackgroundUrl() {
		
		return backgroundUrl;
	}
	
	public MainCharacter getPlayer() {
		
		return player;
	}

	public List<Wall> getWalls() {
		
		return walls;
	}
	
	public List<Entity> getComponents() {
		
		return components;
	}
	
	public List<Enemy> enemies() {
		
		return enemies;
	}
	
	public List<Entity> getDoorWays() {
		
		return doorways;
	}

}
