
public class Address {

	private String houseNumber;
	private String street;
	private String extra = ""; //to get rid of that pesky null
	private String city;
	private String state;
	private String zip;

	public Address(String hn, String st, String c, String s2, String z) {
		setHouseNumber(hn);
		setStreet(st);
		setCity(c);
		setState(s2);
		setZip(z);
		
		if (getState() == null) {
			throw new IllegalArgumentException("State not created.");
		}
		else if (getZip() == null) {
			throw new IllegalArgumentException("Zip not created.");
		}
	}
	public Address(String hnum, String st2, String ex, String c2, String s3, String z2) {
		setHouseNumber(hnum);
		setStreet(st2);
		setExtra(ex);
		setCity(c2);
		setState(s3);
		setZip(z2);
		
		if (state == null) {
			throw new IllegalArgumentException("State not created.");
		}
		else if (zip == null) {
			throw new IllegalArgumentException("Zip not created.");
		}
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		if (state.length() == 2) {
			this.state = state;
		}
		else {
			this.state = null;
		}
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		if (zip.length() == 5) {
			this.zip = zip;
		}
		else {
			this.zip = null;
		}
	}
	
	public void print() {
		System.out.println(this.getHouseNumber() + " " + this.getStreet() + " " + this.getExtra());
		System.out.println(this.getCity() + ", " + this.getState() + ", " + this.getZip());
	}
}
