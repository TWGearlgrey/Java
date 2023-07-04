package sub5;

public class Whale extends Animal {
	private boolean swim;
	
	public Whale() {
		super(0, "", "");
	}
	
	public Whale(int age, String name, String sex, boolean swim) {
		super(age, name, sex);
		this.swim = swim;
	}
	
	public void setSwim(boolean swim) {
		this.swim = swim;
	}

	public boolean getSwim() {
		return true;
	}

	
}
