package fr.diginamic.banque.entites;

public class Debit extends Operation {

	
	
	public Debit(String operation, double montantOperation) {
		super(operation, montantOperation);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String getType() {
		// TODO Auto-generated method stub
		return "DEBIT";
	}

	protected double calculSolde(double solde) {
		// TODO Auto-generated method stub
		return solde - montantOperation;
	}
}
