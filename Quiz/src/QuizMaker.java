
public class QuizMaker {
	
	Quiz[] arr = new Quiz[5]; int index = 0;

	public void Ready()
	{
		Quiz q1 = new Quiz( "���� �����ڵ� �� �� ��°�� �¾ ����� �����ΰ���?", "���ӽ� Ŭ��ũ �߽���","���� ����","���ϳ׽� ��۽��׵�"
				,"�˹�Ʈ ���ν�Ÿ��","c");
		Quiz q2 = new Quiz("���� 2","���� 2-1","���� 2-2","���� 2-3","���� 2-4","a");
		Quiz q3 = new Quiz("���� 3","���� 3-1","���� 3-2","���� 3-3","���� 3-4","a");
		Quiz q4 = new Quiz("���� 4","���� 4-1","���� 4-2","���� 4-3","���� 4-4","a");
		Quiz q5 = new Quiz("���� 5","���� 5-1","���� 5-2","���� 5-3","���� 5-4","a");
		
		arr[0] = q1; arr[1] = q2; arr[2] = q3; arr[3] = q4; arr[4] = q5;
	}
	
	public Quiz Send()
	{
		return arr[index];
	}
	
	public boolean Index()
	{
		if( index == 4 ) return false;
		index ++ ; return true;
	}
	
}
