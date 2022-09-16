package Entities;
/*
 * Entitie Class
 * */
public class One {
private String holder;
private Double balance;

public One(String holder, Double balance) {
	
this.holder = holder;
this.balance = balance;

}
public String getHolder() {
return holder;
}
public void deposit(double amount) {
balance += amount;
}
public void withdraw(double amount) {
balance -= amount;
}
}