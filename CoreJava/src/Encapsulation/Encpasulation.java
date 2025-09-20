package Encapsulation;


class Account{
	private String accountholder;
	 private double balance;
	 private long acc_no;
	 public String getAccountHolder() {
		 return accountholder;
	 }
	 public long getAcc_no() {
		 return acc_no;
	 }
	 public void setAcc_no(long acc_no) {
		 this.acc_no = acc_no;
	 }

	 public void setAccountHolder (String accountholder ) {
		 this.accountholder = accountholder;
	 }
	 public double getBalance() {
		 return balance;
	 }
	  public void deposite(double amount) {
		  
		  if(amount > 0)
	  { 
		  balance = balance + amount;
		   System.out.println("Account Holder Name : "+getAccountHolder());
		   System.out.println("Acconut no : "+getAcc_no());
		  System.out.println("You Have Deposite Amount Rs : "+amount);
		  System.out.println("Now your Balnce Is Rs : "+getBalance());
	  } 
	  else 
	  {
		  System.out.println("Invalid Deposite Amount");
	  }
}
	  public void withdraw(double amount) {
		 
		  if(amount > 0) {
		  
		  balance = balance-amount;
		  System.out.println("You Have withdraw Amount Rs : "+amount);
		  System.out.println("Now your Balance Is Rs : "+getBalance());
	  }
		  else {
			  System.out.println("Invalid Withdraw Amount");
		  }
	  }
}
public class Encpasulation {

	public static void main(String[] args) {
	
     Account ac = new Account();
      
     ac.setAccountHolder("Hashim Ansari");
     ac.setAcc_no(751272301243l);
     ac.deposite(2345);
     ac.withdraw(232);
}
	}     
     
     
     
     
     
     
     
     
     
