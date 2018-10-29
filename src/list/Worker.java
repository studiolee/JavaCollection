package list;

public class Worker {
	private int age;
	private String name;
	private double salary;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Worker(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Worker [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	public void work()
    {
        System.out.println(name+" "+"work");
    } 
}
