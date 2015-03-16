import java.io.Serializable;

public class Registration implements Serializable {
	
	private String name;  
	private String email;  
	private String address; 
	private String city;    
	private String gender;
	private String dob;     
	private String voterid;  
	private String balance;
	private String accountType; 
	private String year;
	private String phone,accountno;
	
	public Registration(String name, String email, String address,String city,String phone,String voterid,String balance,String year,
			 String gender, String accountType,String dob, String accountno)
         {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.city = city;
		this.gender = gender;
		this.voterid = voterid;
		this.dob =dob ;
		this.accountType = accountType ;
		this.year = year;
		this.balance = balance;
		this.phone = phone;
                this.accountno = accountno ;
	}
	
	public Registration()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getVoterid() {
		return voterid;
	}

	public void setVoterid(String voterid) {
		this.voterid = voterid;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getbalance() {
		return balance;
	}

	public void setbalance(String balance) 
        {
		this.balance = balance;
	}
	
	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	

}
