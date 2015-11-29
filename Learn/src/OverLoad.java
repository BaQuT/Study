
public class OverLoad {

	private int a;//0 поумол
	
	public OverLoad() {
		// TODO Auto-generated constructor stub
		a = 100000000;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public void setA(float a) {
		this.a = (int) a;
	}
	
	public void setA(String a) {
		this.a = Integer.valueOf(a);
	}
	
}
