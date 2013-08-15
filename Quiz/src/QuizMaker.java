
public class QuizMaker {
	
	Quiz[] arr = new Quiz[5]; int index = 0;

	public void Ready()
	{
		Quiz q1 = new Quiz( "다음 과학자들 중 세 번째로 태어난 사람은 누구인가요?", "제임스 클러크 멕스웰","마리 퀴리","요하네스 브뢴스테드"
				,"알버트 아인슈타인","c");
		Quiz q2 = new Quiz("문제 2","지문 2-1","지문 2-2","지문 2-3","지문 2-4","a");
		Quiz q3 = new Quiz("문제 3","지문 3-1","지문 3-2","지문 3-3","지문 3-4","a");
		Quiz q4 = new Quiz("문제 4","지문 4-1","지문 4-2","지문 4-3","지문 4-4","a");
		Quiz q5 = new Quiz("문제 5","지문 5-1","지문 5-2","지문 5-3","지문 5-4","a");
		
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
