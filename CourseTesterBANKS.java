
public class CourseTesterBANKS {
	//Steven Banks
	public static void main(String[] args) {
		
		Course herb = new Course("HRB 101", "Herbology Year 1", 3, "Professor Sprout");
		System.out.println(herb.courseInformation());
		
		Course care = new Course("CMC 205", "Care of Magical Creatures", 1);
		System.out.println(care.courseInformation());
		
		Course defense = new Course("DDA 301", "Defense Against the Dark Arts Year 3", 3, "Professor Lupin");
		System.out.println(defense.courseInformation());
		
		Course charms = new Course("CHM 501", "Charms Year 5", 5, "Professor Flitwick");
		System.out.println(charms.courseInformation());
		
		Course trans = new Course("TRN 435", "Transfiguration Year 4", 3, "Professor McGonagall");
		System.out.println(trans.courseInformation());
		
		Course six = trans.duplicate();
		System.out.println(six.courseInformation());
		
		Course seven = defense.duplicate();
		System.out.println(seven.courseInformation());
		
		Course eight = herb.duplicate();
		System.out.println(eight.courseInformation());

	}

}
