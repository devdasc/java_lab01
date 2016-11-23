package Exercise1;

public class Patient {
	//instance variables
	private  String patientID;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String province;
	private String postalCode;
	//constructor
	public Patient(String patientID, String firstName,String lastName,String address, String city, String province, String postaCode )
	{
		this.patientID=patientID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.province=province;
		this.postalCode=postaCode;
	}
	// getter setter
	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	// Output formatter
	public  String getPatientInfo(){
		String patientInfo="Patient Id : "+this.patientID+"\nPatient Name : "+this.firstName+" "+this.lastName+"\nAddress : "
	    +this.address+"\nCity : "+this.city+"\nProvince : "+this.province +"\nPostal Code : "+this.postalCode;
		return patientInfo;
		
	}

}
