
public class StationVO {

	String name; // �� �̸�
	double x,y; // ����, �浵
	
	public StationVO(String name, double x, double y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	/**
	 * ��Ŭ���� �Ÿ� ���
	 * @return �Ǽ��� �Ÿ�
	 */
	public double distance( double x1,double y1 )
	{
		return Math.sqrt( (x1-x)*(x1-x) + (y1-y)*(y1-y) );
	}
	
}
