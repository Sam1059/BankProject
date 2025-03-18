package braindata.bankmanagement.model;


public class Account {
private String accno;
private String name;
private String adharno;
private String gender;
private int age;
private double balance;
public Account(String accno, String name, String adharno, String gender, int age, double balance) {
     this.accno=accno;
    this.name = name;
    this.adharno = adharno;
    this.gender = gender;
    this.age = age;
    this.balance = balance;
}
public String getAccno() {
	return accno;
}
public void setAccno(String accno) {
	this.accno = accno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdharno() {
	return adharno;
}
public void setAdharno(String adharno) {
	this.adharno = adharno;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
}
