package Model;

public class Classroom {
	//Steven Banks
	
	private String building;
	private String roomNumber;
	private String campus;
	private String type;
	private int capacity;
	
	public Classroom() {
		
	}
	
	public Classroom(String build, String rNum, String camp, String typ, int cap) {
		setBuilding(build);
		setRoomNumber(rNum);
		setCampus(camp);
		setType(typ);
		setCapacity(cap);
	}
	
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return "Classroom [building=" + building + ", roomNumber=" + roomNumber + ", campus=" + campus + ", type="
				+ type + ", capacity=" + capacity + "]";
	}
	
	
}
