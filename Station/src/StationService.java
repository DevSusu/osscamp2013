import java.util.*;

public class StationService {

	StationVO[] arr = new StationVO[10];
	
	/**
	 * 역의 이름, 위치에 대한 정보를 준비한다.
	 */
	public void Ready()
	{
		arr[0] = new StationVO( "숭실대입구",37.49619,126.9538 );
		arr[1] = new StationVO( "김포공항",37.56186,126.801789 );
		arr[2] = new StationVO( "건대입구",37.540766, 127.070979 );
		arr[3] = new StationVO( "소요산",37.948089, 127.061067 );
		arr[4] = new StationVO( "노원",37.656407,	127.063383 );
		arr[5] = new StationVO( "미아삼거리",37.613275, 127.030067 );
		arr[6] = new StationVO( "홍대입구",37.556775, 126.923608 );
		arr[7] = new StationVO( "강남",37.496857, 127.028107 );
		arr[8] = new StationVO( "오이도",37.361903	, 126.73845 );
		arr[9] = new StationVO( "부평",37.489451,	126.724566 );
	}
	
	/**
	 * 현재 위치의 위도, 경도를 입력받는다.
	 */
	Scanner scan = new Scanner(System.in);
	public void Input()
	{
		mx = scan.nextDouble(); my = scan.nextDouble();
	}
	
	/**
	 * 가장 가까운 역의 이름과 거리를 저장한다.
	 */
	double mx,my; double min = 100000000; int i = 0, ans;
	public void Minimum()
	{
		if( i == 10 ) return ;
		
		double tmp = arr[i].distance( mx, my ); // 거리 계산
		if( tmp < min ){ min = tmp; ans = i; } i++; // 최솟값 계산

		Minimum();
	}
	
	/**
	 * 가장 가까운 위치의 역을 출력한다.
	 */
	public void Output()
	{
		System.out.print( arr[ans].name + "(이)가 가장 가깝습니다.\n" + arr[ans].x + " " + arr[ans].y );
	}
	
}
