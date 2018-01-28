package teststrings;

public class AddingnumericValueOfstrings {
	private static void addages(String[] a) {
		// TODO Auto-generated method stub

		int sum = 0;

		for (String a1 : a) {

			String[] b = a1.split("_");
			for (String b1 : b) {
				if (isStringNumeric(b1)) {

					int i = Integer.parseInt(b1);
					sum = sum + i;
				}
			
			System.out.println(sum);
			}

		}
	}

	public static boolean isStringNumeric(String s) {
		try {
			 Integer.parseInt(s);

			return true;
		} catch (Exception e) {

			System.out.println("Not a numeric ");
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[] { "Anjali_Mishra_10", "Pochu_T_16", "Rudra_T_12" };

		addages(array);
	}

}
