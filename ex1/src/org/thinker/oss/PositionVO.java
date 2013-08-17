package org.thinker.oss;

//abstract -> �߻� Ŭ����.  interface���� ������ ��� �޼ҵ带 ������ �ʾƵ� �ȴ�. ������ ���� �޼ҵ�� ����ϴ� Ŭ�������� ���������.
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