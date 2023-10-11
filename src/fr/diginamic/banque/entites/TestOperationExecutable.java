package fr.diginamic.banque.entites;

public class TestOperationExecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operation[] operations = {new Debit("premier débit", 4.0),
				new Credit("premier crédit", 8.49),
				new Debit("second débit",89.0),
				new Debit("second credit", 239.0)};
			
		System.out.println();
		
		double solde = 0.0;
				
		for (Operation op: operations) {
			solde=op.calculSolde(solde);
			System.out.println(op+"solde de "+solde);
		}
		
		
		
		
	}

}
