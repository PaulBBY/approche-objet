package fr.diginamic.banque.entites;

public abstract class Operation {
	

	public static double solde = 0.0;

	protected String operation;
	protected double montantOperation;
	
	public Operation(String operation, double montantOperation) {
		super();
		this.operation = operation;
		this.montantOperation = montantOperation;
	}
	
	protected abstract double calculSolde(double solde);

	protected abstract String getType();
	
	@Override
	public String toString() {
		return "Opération :"+operation
				+" de type :"+getType()
				+" d'un montant de "+montantOperation;
	}
	
	
	
	

}
