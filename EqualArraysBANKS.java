public class EqualArraysBANKS {
	//Steven Banks
	public static void main(String[] args) {
		int[] a1 = {1, 2, 3, 4, 5};
		int[] a2 = {1, 2, 3, 4, 5};
		int[] a3 = {1, 3, 5, 6, 7};
		int[] a4 = {1, 2, 3, 4, 5, 6, 7};
		boolean one = equalArrays(a1, a2);
		boolean two = equalArrays(a1, a3);
		boolean three = equalArrays(a1, a4);
		
		System.out.println("Are arrays 1 and 2 equal? " + one);
		System.out.println("Are arrays 1 and 3 equal? " + two);
		System.out.println("Are arrays 1 and 4 equal? " + three);
	
		
	}
	public static boolean equalArrays(int[] array1, int[] array2) {
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					return false;
				}
			}
		} else {return false;}		
	return true;
	}

}
