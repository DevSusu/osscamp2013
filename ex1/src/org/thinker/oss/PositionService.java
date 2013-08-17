package org.thinker.oss;

import java.util.ArrayList;

public class PositionService {

	private static PositionService instance;
	
	public static PositionService getInstance(){
		
		if ( instance == null )
		{
			instance = new PositionService();
		}
		return instance;
	}
	
	private ArrayList<PositionContent> list;
	
	public PositionService() {
		list = new ArrayList<PositionContent>();
		//add user data	
	}
	
	/**
	 * add new content 
	 * 
	 * @param vo
	 */
	public void addContent(PositionContent vo){
		
		list.add(vo);
	}
	
	/**
	 * find the nearest PositionContent by location 
	 * @param lat
	 * @param lng
	 * @return
	 */
	public PositionContent getContent( double lat, double lng){
		
		double min = Double.MAX_VALUE;
		PositionContent minVO = null;
		
		for (PositionContent vo : list) { // 루프 안돌리는 방법 생각해보기
			
			double distance = vo.calcDistance(lat, lng);
			if(distance < min){
				min = distance;
				minVO = vo;
			}
		}
		addContent( minVO );
		return minVO;
		
	}
	
	/**
	 * gets the last value of list( which is the nearest PositionContent )
	 * return
	 */
	public PositionContent getLast()
	{
		return list.get(list.lastIndexOf(list));
	}

}
