import java.util.*;

public class StationService {

	StationVO[] arr = new StationVO[10];
	
	/**
	 * ���� �̸�, ��ġ�� ���� ������ �غ��Ѵ�.
	 */
	public void Ready()
	{
		arr[0] = new StationVO( "���Ǵ��Ա�",37.49619,126.9538 );
		arr[1] = new StationVO( "��������",37.56186,126.801789 );
		arr[2] = new StationVO( "�Ǵ��Ա�",37.540766, 127.070979 );
		arr[3] = new StationVO( "�ҿ��",37.948089, 127.061067 );
		arr[4] = new StationVO( "���",37.656407,	127.063383 );
		arr[5] = new StationVO( "�̾ƻ�Ÿ�",37.613275, 127.030067 );
		arr[6] = new StationVO( "ȫ���Ա�",37.556775, 126.923608 );
		arr[7] = new StationVO( "����",37.496857, 127.028107 );
		arr[8] = new StationVO( "���̵�",37.361903	, 126.73845 );
		arr[9] = new StationVO( "����",37.489451,	126.724566 );
	}
	
	/**
	 * ���� ��ġ�� ����, �浵�� �Է¹޴´�.
	 */
	Scanner scan = new Scanner(System.in);
	public void Input()
	{
		mx = scan.nextDouble(); my = scan.nextDouble();
	}
	
	/**
	 * ���� ����� ���� �̸��� �Ÿ��� �����Ѵ�.
	 */
	double mx,my; double min = 100000000; int i = 0, ans;
	public void Minimum()
	{
		if( i == 10 ) return ;
		
		double tmp = arr[i].distance( mx, my ); // �Ÿ� ���
		if( tmp < min ){ min = tmp; ans = i; } i++; // �ּڰ� ���

		Minimum();
	}
	
	/**
	 * ���� ����� ��ġ�� ���� ����Ѵ�.
	 */
	public void Output()
	{
		System.out.print( arr[ans].name + "(��)�� ���� �������ϴ�.\n" + arr[ans].x + " " + arr[ans].y );
	}
	
}
