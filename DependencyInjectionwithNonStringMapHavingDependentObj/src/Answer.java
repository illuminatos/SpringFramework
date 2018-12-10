import java.util.Date;

public class Answer {

	private int id;
	private String answer;
	private Date date;

	public Answer() {
		super();
	}

	public Answer(int id, String answer, Date date) {
		super();
		this.id = id;
		this.answer = answer;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
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
