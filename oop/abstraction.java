package oop;

  class Users{
	  String name;
	  private String password;
	  
	  Users(String name){
		  this.name=name;
	  }
	  
	  public void displayName() {
		  System.out.println("Name is :- "+ this.name);
	  }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	  
  }


public class abstraction {
	public static void main(String[] args) {
		Users u=new Users("dahit");
		u.displayName();
		u.setPassword("knock");
		System.out.println("Your password is  "+ u.getPassword());
		
	}

}
