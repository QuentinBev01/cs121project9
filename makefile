Customer.class: Customer.java User.class CheckingAccount.class SavingsAccount.class
	javac -g Customer.java

User.class: User.java HasMenu.class
	javac -g User.java

CheckingAccount.class: CheckingAccount.java HasMenu.class
	javac -g SavingsAccount.java

SavingsAccount.class: SavingsAccount.java CheckingAccount.class
	javac -g 

Has.Menu.class: HasMenu.java
	javac -g HasMenu.java

Bank.class: Bank.java
	javac -g Bank.java

Admin.class: Admin.java
	javac -g Admin.java

testAdmin: Admin.class
	java Admin

testCustomer: Customer.class
	java customer

testChecking: Checking.Account.class
	java CheckingAccount

testSavings: SavingsAccount.class
	java SavingsAccount 

testBank: Bank.class Customer.class Admin.class
	java Bank 

clean:
	rm*.class
