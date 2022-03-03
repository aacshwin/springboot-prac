/**
 * 
 */

// This is the Contructor function
function Employee(name){
	this.name = name;
}

//Approach 1 : Everytime new employee object is created, getName function is called here
function Employee(name){
	this.name = name;
	
	this.getName = function(){
		return this.name;
	}
}

let e1 = new Employee("Ed");
let e2 = new Employee("Edd");	

//Approach 2 : Same scenario
function Employee(name){
	this.name = name;
}

let e1 = new Employee("Ed");	
e1.getName = function(){
	return this.name;
}

//Approach 3 : By storing it in prototype, we can re use same fucntion w/o creating copies of it
function Employee(name){
	this.name = name;
}

Employee.prototype.getNamme = function(){
	return this.name;
}

let e1 = new Employee("Ed");
let e2 = new Employee("Edd");	




