import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String question;
	private Map<User, Answer> answers;

	public Question() {
		super();
	}

	public Question(int id, String question, Map<User, Answer> answers) {
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

	public Map<User, Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<User, Answer> answers) {
		this.answers = answers;
	}
	
	public void print() {
		System.out.println("id: " + id + " question: " + question);
		System.out.println("Answers: ");
		Set<Entry<User,Answer>> set = answers.entrySet();
		Iterator<Entry<User,Answer>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<User,Answer> entry = itr.next();
			User user = entry.getKey();
			Answer answer = entry.getValue();
			System.out.println("User: " + user + " Answer: " + answer);
		}
 	}

}
