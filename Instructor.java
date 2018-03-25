package Model;

public class Instructor {
	//Steven Banks
		
		private String firstName;
		private String lastName;
		private String email;
		
		public Instructor() {
			
		}
		
		public Instructor(String fName, String lName, String e) {
			setFirstName(fName);
			setLastName(lName);
			setEmail(e);
		}
		
		public Instructor(String fName, String lName) {
			setFirstName(fName);
			setLastName(lName);
			setEmail(makeEmailAddress(fName, lName));
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Instructor [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
		}
		
		public String makeEmailAddress(String firstName, String lastName) {
			firstName = firstName.toLowerCase();
			lastName = lastName.toLowerCase();
			String address = "@dmacc.edu";
			char firstLetter = firstName.charAt(0);
			String message = firstLetter + lastName + address;
			return message;
			
		}
		
		
}
