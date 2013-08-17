package org.thinker.oss;

public interface PositionContent {
	
	public double getLat();
	
	public double getLng();
	
	public String desc();
	
	public boolean check(String userInput);
	
	public double calcDistance(double lat, double lng);
// 추상 메소드
}
