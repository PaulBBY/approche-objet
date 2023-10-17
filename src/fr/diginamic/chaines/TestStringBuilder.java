package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String leString = "";
		StringBuilder builder = new StringBuilder();
		
		long debut = System.currentTimeMillis();
		
		for(int i =1; i<=100000; i++) {
			builder.append(i+", ");
		}
		
		long fin = System.currentTimeMillis();
		
		leString = builder.toString();
		System.out.println(fin - debut);*/
		
		String leString2 = "";
		long debut = System.currentTimeMillis();

		for(int i =1; i<=100000; i++) {
			leString2 = leString2+i;
		}
		long fin = System.currentTimeMillis();
		
		System.out.println(fin - debut);
	}

}
