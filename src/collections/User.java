package collections;

public class User implements Comparable<User>{
	private int score;
	private int age;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int score, int age) {
		super();
		this.score = score;
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	/*
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * compareTo是Comparable接口里的方法，它返回一个int型的数，0表示相等，>0表示排在前面，<0表示要排在后面
	 */
	@Override
	public int compareTo(User o) {
		int i = this.getAge() - o.getAge();//先按年龄排
		if(i == 0){//如果年龄相同，那么就再按成绩排
			return this.getScore() - o.getScore();
		}
		return i;
	}

	@Override
	public String toString() {
		return "User [score=" + score + ", age=" + age + "]";
	}
	
}
