package visitors;

import entities.ActivePotionTypeA;
import entities.EnemyTypeA;
import entities.Entity;
import entities.Fruit;
import entities.MainCharacter;
import entities.Potion;
import entities.PoweredDot;
import entities.RegularDot;
import entities.Wall;

public class VisitorFruitTypeA implements Visitor{
	
	private Entity fruit;
	
	public VisitorFruitTypeA(Fruit fruit) {
		this.fruit = fruit;
	}

	@Override
	public void visitWall(Wall w) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitMainCharacter(MainCharacter m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitEnemyTypeA(EnemyTypeA e) {
		// TODO Auto-generated method stub
		
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
	public void visitActivePotionTypeA(ActivePotionTypeA a) {
		// TODO Auto-generated method stub
		
	}

}