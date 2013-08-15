
public class Ball {

	int num; boolean used;

	public Ball(int num, boolean used) {
		super();
		this.num = num;
		this.used = used;
	}
	
	public boolean Check()
	{
		return used;
	}

	@Override
	public String toString() {
		return "Ball [num=" + num + "]";
	}

}
