package org.thinker.oss;

public class MemberPositionVO extends PositionVO {

	// private -> protected
	protected String tel; protected String address; protected String email;
	
	// �̹��� �������� �ּ� �ʿ�

	public MemberPositionVO(double lat, double lng, String name,  String tel, String address, String email ) {
		super(lat, lng, name);
		this.tel = tel; this.address = address; this.email = email;
	}



	@Override
	public boolean check(String userInput) {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public String toString() {
		return "MemberPositionVO [tel=" + tel + "]" + super.toString();
	}
	

}
