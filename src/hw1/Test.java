package hw1;



public class Test {
	public static void main(String args[]) {
		Bowling g=new Bowling("ABC", "XYZ",3);
		g.bowl(2);
		g.bowl(4);
		g.bowl(1);
		g.bowl(3);
		g.bowl(6);
		g.bowl(4);
		g.bowl(2);
		System.out.println(g.isGameOver());
//		System.out.println(g.getRemainingPins());
//		System.out.println(g.getCurrentFrame());
	}
}
