

public class QuizUI {

	QuizMaker Zamal = new QuizMaker();
	// �Ұ�
	public void intro()
	{
		System.out.println("���ݺ��� OSS ������ķ�� ��� �����ϰڽ��ϴ�!!");
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
		System.out.println("�����մϴ�! ��� ������ Ǫ�̽��ϴ�. ���� ��ҷ� �̵��Ͻʽÿ�.");
	}
}
