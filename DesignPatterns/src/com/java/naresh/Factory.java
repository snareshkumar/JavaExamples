package com.java.naresh;

abstract class Bank{
	public abstract void deposit();
	public abstract void withdraw();
	public void getBankInfo() {
		System.out.println("Bank Method Called");
	}
}

class SBI extends Bank{

	@Override
	public void deposit() {
		System.out.println("SBI Deposit Method called");
		
	}

	@Override
	public void withdraw() {
		System.out.println("SBI Withdraw method called");
		
	}
	
}
class IOB extends Bank{

	@Override
	public void deposit() {
		System.out.println("IOB Deposit method called");
		
	}

	@Override
	public void withdraw() {
		System.out.println("IOB withdraw method called");
		
	}
	
}

class BankFactory{
	public static Bank getBankObject(String type){
		if("IOB".equalsIgnoreCase(type)) {
			return new IOB();
		}
		if("SBI".equalsIgnoreCase(type)) {
			return new SBI();
		}
		return null;
	}
}
public class Factory {

	public static void main(String[] args) {
		
		Bank sbiObject = BankFactory.getBankObject("SBI");
		System.out.println("SBI Object created Successfully");
		sbiObject.deposit();
		sbiObject.withdraw();
		
		Bank iobObject = BankFactory.getBankObject("IOB");
		System.out.println("IOB Object created Successfully");
		iobObject.deposit();
		iobObject.withdraw();
		
		

	}

}
