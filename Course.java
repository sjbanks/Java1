package Model;
import java.time.LocalTime;

public class Course {
	//Steven Banks
	
	private String crn;
	private String courseName;
	private LocalTime startTime;
	private LocalTime endTime;
	private Instructor teacher;
	private Classroom location;
	
	public Course() {
		
	}
	
	public Course(String crNumber, String cName, LocalTime sTime, LocalTime eTime, Instructor teach, Classroom loc) {
		setCrn(crNumber);
		setCourseName(cName);
		setStartTime(sTime);
		setEndTime(eTime);
		setTeacher(teach);
		setLocation(loc);
	}
	
	public String getCrn() {
		return crn;
	}
	public void setCrn(String crn) {
		this.crn = crn;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public Instructor getTeacher() {
		return teacher;
	}
	public void setTeacher(Instructor teacher) {
		this.teacher = teacher;
	}
	public Classroom getLocation() {
		return location;
	}
	public void setLocation(Classroom location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Course [crn=" + crn + ", courseName=" + courseName + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", teacher=" + teacher + ", location=" + location + "]";
	}
	
	
}
