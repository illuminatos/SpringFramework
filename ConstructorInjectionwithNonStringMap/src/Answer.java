import java.util.*;

public class Answer {
	
	private int id;
	private String answer;
	private Date date;
	public Answer(int id, String question, Date date) {
		super();
		this.id = id;
		this.answer = question;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return answer;
	}
	public void setQuestion(String question) {
		this.answer = question;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", date=" + date + "]";
	}
	
	

}
