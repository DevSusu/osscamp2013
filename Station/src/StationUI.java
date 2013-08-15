
public class StationUI {
	
	StationService st = new StationService();
	
	public void process()
	{
		// 역 정보 준비
		st.Ready();
		// 현 위치 입력
		st.Input();
		// 최솟값 구하기
		st.Minimum();
		// 출력
		st.Output();
	}
}