package fr.diginamic.banque.entites;

public class Credit extends Operation {
	
	
	
	double i = Operation.solde;
	
	
	public Credit(String operation, double montantOperation) {
		super(operation, montantOperation);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String getType() {
		// TODO Auto-generated method stub
		return "CREDIT";
	}

	@Override
	protected double calculSolde(double solde) {
		// TODO Auto-generated method stub
		return  solde +  montantOperation;
	}
	
}
