import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int id;
	private String question;
	private List<String> answers;
	public Question(int id, String question, List<String> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public void print() {
		System.out.println("id: " + id + " question: " + question);
		System.out.println("answers: ");
		Iterator<String> itr = answers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
