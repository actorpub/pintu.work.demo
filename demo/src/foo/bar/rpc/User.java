package foo.bar.rpc;

/**
 * 
 * @author Silence
 * 这个类没啥用，只是为了增加response body的复杂程度
 */
public class User {

	private String name;
	private int age;
	private String password;

	public User(String name, int age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
