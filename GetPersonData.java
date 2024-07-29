package directory;

public class GetPersonData {

	private String name;
	private String address;
    private String telephone;
    private String mobile;
    private String headOfFamily;
    private String uniqueID;
	
	
    public GetPersonData(String name, String address, String telephone, String mobile, String headOfFamily,
			String uniqueID) {
		super();
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.mobile = mobile;
		this.headOfFamily = headOfFamily;
		this.uniqueID = uniqueID;
	}
    
    
    @Override
	public String toString() {
		return "\nname = " + name + "\naddress = " + address + "\ntelephone = " + telephone + "\nmobile = "
				+ mobile + "\nheadOfFamily = " + headOfFamily + "\nuniqueID = " + uniqueID;
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getHeadOfFamily() {
		return headOfFamily;
	}
	public void setHeadOfFamily(String headOfFamily) {
		this.headOfFamily = headOfFamily;
	}
	public String getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
}
