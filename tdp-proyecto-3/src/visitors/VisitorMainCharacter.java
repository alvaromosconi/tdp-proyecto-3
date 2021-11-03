package visitors;

import entities.EnemyTypeA;
import entities.Entity;
import entities.MainCharacter;
import entities.Wall;

public class VisitorMainCharacter implements Visitor {

	private Entity player;
	
	public VisitorMainCharacter(MainCharacter player) {
		
		this.player = player;
	}
	
	@Override
	public void visitWall(Wall w) {
		
		int myXValue = w.getXValue();
		int myYValue = w.getYValue();
		
		if (myXValue <= player.getXValue())
			player.setXValue(player.getXValue() + myXValue + 5);
	}

	@Override
	public void visitMainCharacter(MainCharacter m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitorEnemyTypeA(EnemyTypeA e) {
		// TODO Auto-generated method stub
		
	}

}
