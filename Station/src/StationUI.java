
public class StationUI {
	
	StationService st = new StationService();
	
	public void process()
	{
		// �� ���� �غ�
		st.Ready();
		// �� ��ġ �Է�
		st.Input();
		// �ּڰ� ���ϱ�
		st.Minimum();
		// ���
		st.Output();
	}
}