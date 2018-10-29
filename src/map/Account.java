package map;

import java.util.Random;

public class Account {
	private long id;  
	private double balance;
	private String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Account(double balance, String password) {
		//id随机生成
		Random rd = new Random();
		this.id = rd.nextInt(10);
		this.balance = balance;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", password=" + password + "]";
	}
	
}
