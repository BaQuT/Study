import helloworld.Hello;
import helloworld.World;

public class helloworld {

	public static void main(String[] args) {

		Hello hello = new Hello();
		World world = new World();
		
	
		
		System.out.println(hello.strHello + " " + world.strWorld);

		System.out.println( World.strWWW );
		
		System.out.println( hello.get() );
		
//		hello.strHi = "123";
		
		/*****************************************************/
		
		OverLoad over = new OverLoad();
		
		System.out.println( over.getA() );
		
		over.setA(100);
		
		System.out.println( over.getA() );
		
		over.setA(3.5343f);
		
		System.out.println( over.getA() );
		
		over.setA("123");
		
		System.out.println( over.getA() );
		
	}

}
