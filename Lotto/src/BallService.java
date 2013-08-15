
public class BallService {

	Ball[] arr1 = new Ball[45]; // 45개 공 저장
	Ball[] arr2 = new Ball[6]; // 6개 뽑아서 저장할 공간
	int count = 0;
	
	public void MakeBall()
	{
		for( int i=0;i<45;i++ ){ arr1[i] = new Ball( i+1,false ); }
	}
	
	public void ChoiceBall()
	{
		if( count == 6 ) return ;
		
		int tmp = (int)(Math.random()*45);
		if( arr1[tmp].Check() ){ ChoiceBall(); return ; }
		
		arr2[count++] = arr1[tmp]; arr1[tmp].used = true;
		ChoiceBall();
	}
	
	public void PrintBall()
	{
		for( int i=0;i<6;i++ ) System.out.println( arr2[i] );
	}
	
}