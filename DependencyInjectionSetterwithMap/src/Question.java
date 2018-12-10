import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String question;
	private Map<String, String> answers;

	public Question() {
		super();
	}

	public Question(int id, String question, Map<String, String> answers) {
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

	public Map<String, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	
	public void print() {
		System.out.println("id: " + id + " question: " + question);
		System.out.println("Answers: ");
		Set<Entry<String,String>> set = answers.entrySet();
		Iterator<Entry<String,String>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String,String> entry = itr.next();
			System.out.println("Answer: " + entry.getKey() + " by: " + entry.getValue());
		}
	}

}
