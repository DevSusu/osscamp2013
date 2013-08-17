package org.thinker.oss;

//abstract -> 추상 클래스.  interface에서 정의한 모든 메소드를 가지지 않아도 된다. 가지지 않은 메소드는 상속하는 클래스에서 만들어진다.
public abstract class PositionVO implements PositionContent{

	// private -> protected
	protected double lat;
	protected double lng;
	protected String name;
	
	public PositionVO(double lat, double lng, String name) {
		super();
		this.lat = lat;
		this.lng = lng;
		this.name = name;
	}
	
	@Override
	public double getLat() {
		// TODO Auto-generated method stub
		return lat;
	}

	@Override
	public double getLng() {
		// TODO Auto-generated method stub
		return lng;
	}

	@Override
	public String desc() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double calcDistance(double lat, double lng) {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow((this.lat - lat ), 2) + Math.pow((this.lng - lng), 2));
	}

	@Override
	public String toString() {
		return "  lat=" + lat + ", lng=" + lng + ", name=" + name ;
	}


}