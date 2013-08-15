
public class StationVO {

	String name; // 역 이름
	double x,y; // 위도, 경도
	
	public StationVO(String name, double x, double y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 유클리드 거리 계산
	 * @return 실수형 거리
	 */
	public double distance( double x1,double y1 )
	{
		return Math.sqrt( (x1-x)*(x1-x) + (y1-y)*(y1-y) );
	}
	
}
