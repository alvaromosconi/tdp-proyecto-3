package entities;
import visitors.Visitor;

public class EnemyTypeB extends Enemy {

	public EnemyTypeB(int xValue, int yValue, String imageRoute) {
		

		this.xValue = xValue;
		this.yValue = yValue;
		this.imageRoute = imageRoute;
		
		
	}
	
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scatter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frightened() {
		// TODO Auto-generated method stub
		
	}

}
