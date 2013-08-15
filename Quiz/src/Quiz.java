import java.util.Scanner;


public class Quiz {

	String text; String a1,a2,a3,a4; String answer;
	Scanner scan = new Scanner( System.in );
	
	/**
	 * Quiz 생성자
	 */
	public Quiz( String text, String a1,String a2,String a3,String a4, String answer )
	{
		super();
		this.text = text; this.a1 = a1; this.a2 = a2; this.a3 = a3; this.a4 = a4; this.answer = answer;
	}
	
	/**
	 * 정답이 올바른지 확인
	 */
	public boolean Check( )
	{
		String ans = scan.next();
		if( ans.equals(answer) ) return true;
		return false;
	}
	
	/**
	 * 문제를 낭독해줍니다
	 */
	public void Read()
	{
		System.out.println( text );
		System.out.println( "a : " + a1 );
		System.out.println( "b : " + a2 );
		System.out.println( "c : " + a3 );
		System.out.println( "d : " + a4 );
	}
	
}
