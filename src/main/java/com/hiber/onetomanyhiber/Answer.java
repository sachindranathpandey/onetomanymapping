package com.hiber.onetomanyhiber;

import javax.persistence.*;

@Entity
public class Answer {

	@Id
	int answerid;
	
	String answer;
	
	@ManyToOne
	Question question;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answerid, String answer) {
		super();
		this.answerid = answerid;
		this.answer = answer;
	}
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer [answerid=" + answerid + ", answer=" + answer + "]";
	}
	
	
	
}
