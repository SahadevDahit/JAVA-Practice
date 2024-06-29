package oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;


class MyBank{
	private String name;
	private String account;
	private long balance;
	private long creditLimit;
	
		public MyBank(String name, String account, long balance, long creditLimit) {
		super();
		if(balance<0) {
			throw new IllegalArgumentException("Balance should not be less than 0");
		}
		if(balance>creditLimit) {
			throw new IllegalArgumentException("The balance should not cross the credit limit");
		}
		
		this.name=name;
		this.account = account;
		this.balance = balance;
		this.creditLimit = creditLimit;
	}
	public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(long creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public boolean deposit(long depositAmount) {
		if(this.balance>=this.creditLimit) {
			System.out.println("Reached to Credit Limit");
			return false;
		}
		else if((this.balance+depositAmount)>this.creditLimit) {
			System.out.println("Reached Credit limit");
			return false;
		}else {
			this.balance+=depositAmount;
		return true;
		}	
	}
	
	public boolean withdraw(long withdrawAmount) {
		if(withdrawAmount>this.balance) {
			System.out.println("Balance insufficient to be withdrawn");
			return false;
		}else {
			this.balance=this.balance-withdrawAmount;
		return true;
		}	
		
	}
	
	
}
public class banking_OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Account of John
		MyBank john=new MyBank("John","AX19070169",20000,50000);
//		john.setCreditLimit(60000);
//		john.deposit(30001);
//		john.withdraw(22000);
		
		//Account of Antony
		MyBank antony=new MyBank("Antony","AX19070170",70000,140000);
		
		// Transfer the amount from the antony to the john
		long depositAmount=30000;
		MyBank sender=antony;
		MyBank receiver=john;
		boolean isSenderTrue=sender.withdraw(depositAmount);
		boolean isReceiverTrue=receiver.deposit(depositAmount);
		
		if(isSenderTrue && isReceiverTrue) {
			System.out.println("Transaction Sucessfull");			
			System.out.println("The new balance of "+sender.getName()+" is "+sender.getBalance());
			System.out.println("The new balance of "+receiver.getName()+" is "+receiver.getBalance());
			
		}else if(!isSenderTrue && isReceiverTrue) {
			receiver.withdraw(depositAmount);
			System.out.println("The transaction failed");
			
		}else if(!isReceiverTrue && isSenderTrue) {
			sender.deposit(depositAmount);
			System.out.println("The transaction failed");			
		}else {
			System.out.println("Transaction failed");
		}
	
	}

}
