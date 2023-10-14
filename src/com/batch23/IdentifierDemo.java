package com.batch23;

public class IdentifierDemo {
    //int accountbalance; 
	//rule 2
	int account_balance;
	//int accountbalance#;//Syntax error on token "Invalid Character", delete this token
	//rule 3
	int 1accountbalance;//Syntax error on token "1", delete this token
	int accountbalance1;//valid
	//Rule 4
	int accountbalance;
	int ACCOUNTBALANCE;
	int Accountbalance;
	int aCcountbalance;
	//rule 5
	int permentaddressofcustomerareainindiaorisrial;
	//rule 6
	int class;//Syntax error on token "class", invalid VariableDeclarator
	int if;//Syntax error on token "if", invalid VariableDeclarator
	//rule 7
	int Runnable;
	int String;
	
}
