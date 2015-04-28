package application;


public class Customer {
	private String fname;
	private String mi;
	private String lname;
	private String gend;
	private String address;
	private String city;
	private String state;
	private String zip;
	
	public Customer(String fname, String mi, String Lname, String gend, String address, String city, String state, String zip){
	this.fname = "FirstName";
	this.mi = "MiddleInitial";
	this.lname = "LastName";
	this.gend = "Gender";
	this.address = "Address";
	this.city = "City";
	this.state = "State";
	this.zip = "ZipCode";
	}
	
	public String getfname() { 
		return fname; 
	}
	public String getmi() {
		return mi;
	}
	public String getlname(){
		return lname;
	}
	public String getgender() {
		return gend;
	}
	public String getaddress(){
		return address;
	}
	public String getcity(){
		return city;
	}
	public String getstate(){
		return state;
	}
	public String getzip(){
		return zip;
	}
	
	public void setfname(String name){
		this.fname = name;
	}
	public void setmi(String I){
		this.mi = I;
	}
	public void setlname(String lame){
		this.lname = lame;
	}
	public void setgender(String gen){
		this.gend = gen;
	}
	public void setcity(String cit){
		this.city = cit;
	}
	public void setstate(String st){
		this.state = st;
	}
	public void setzip(String z){
		this.zip = z;
	}
	
	
}

