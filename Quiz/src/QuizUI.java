

public class QuizUI {

	QuizMaker Zamal = new QuizMaker();
	// 소개
	public void intro()
	{
		System.out.println("지금부터 OSS 개발자캠프 퀴즈를 시작하겠습니다!!");
		Zamal.Ready();
	}
	
	public void process()
	{
		Zamal.Ready();
		Quiz qu = Zamal.Send();
		qu.Read();
		
		if( qu.Check() )
		{
			System.out.println("You're Right!!");
			if( !Zamal.Index() ) return ;
		}
		process();
	}
	
	public void Ending()
	{
		System.out.println("축하합니다! 모든 문제를 푸셨습니다. 다음 장소로 이동하십시오.");
	}
}
