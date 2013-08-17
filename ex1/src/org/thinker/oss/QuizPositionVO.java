package org.thinker.oss;

public class QuizPositionVO extends PositionVO {

	String question;
	String answer;
	String desc;

	public QuizPositionVO(double lat, double lng, String name, String question, String answer,String desc) {
		super(lat, lng, name);
		this.question = question;
		this.answer = answer;
		this.desc = desc;
	}

	@Override
	public boolean check(String userInput) {
		// TODO Auto-generated method stub
		return this.answer.equals(userInput);
	}

	@Override
	public String toString() {
		return "QuizPositionVO [name = " + this.name + "lat = " + this.lat + "lng = " + this.lng + "question=" + question 
				+ ", desc=" + desc + "]";
	}

}
