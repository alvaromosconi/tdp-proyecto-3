package visitors;

import entities.PowerTypeA;
import entities.PowerTypeB;
import entities.Doorway;
import entities.Enemy;
import entities.EnemyTypeA;
import entities.EnemyTypeB;
import entities.EnemyTypeC;
import entities.Fruit;
import entities.MainCharacter;
import entities.Potion;
import entities.PoweredDot;
import entities.RegularDot;
import entities.Wall;

public class VisitorDoorway implements Visitor {
	private int size = 36; // Game?

	public VisitorDoorway(Doorway doorway) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visitMainCharacter(MainCharacter m) {

	}


	@Override
	public void visitFruitTypeA(Fruit f) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitFruitTypeB(Fruit f) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitFruitTypeC(Fruit f) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitPotionTypeA(Potion p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitPotionTypeB(Potion p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitPoweredDot(PoweredDot p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitRegulardDot(RegularDot p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitWall(Wall w) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitActivePotionTypeA(PowerTypeA a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitDoorway(Doorway doorway) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitEnemy(Enemy enemy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitActivePotionTypeB(PowerTypeB a) {
		// TODO Auto-generated method stub
		
	}


}
