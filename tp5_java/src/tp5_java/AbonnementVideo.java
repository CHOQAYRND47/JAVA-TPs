package tp5_java;

public class AbonnementVideo extends Abonnement implements Reducible {
	
	private boolean optionHD , option4K;
	
	public AbonnementVideo(String nom, double prixBase, int nbProfils) {
		super(nom, prixBase, nbProfils);
	}

	@Override
	public double calculerCoutMensuel() {
		
		double prixBase =getPrixBase();
		return prixBase + (optionHD?10:0)+(option4K?20:0);
	}

	@Override
	public int calculerScoreSatisfaction() {
		int score =60 + (optionHD?10:0)+(option4K?20:0)+(getNbProfils()>=4?10:0);
		return score>100?100:score;
	}
	
	public boolean isOptionHD() {
		return optionHD;
	}

	public void setOptionHD(boolean optionHD) {
	    if (optionHD) {
	        this.option4K = false;
	    }
	    this.optionHD = optionHD;
	}
	
	public boolean isOption4K() {
		return option4K;
	}

	public void setOption4K(boolean option4k) {
	    if (option4k) {
	        this.optionHD = false;
	    }
	    this.option4K = option4k;
	}

	@Override
	public double AppliquerReduction(double pourcentage) {
		return EstEligibleReduction(pourcentage)?calculerCoutMensuel()-(calculerCoutMensuel()*pourcentage/100):calculerCoutMensuel();
	}

	@Override
	public boolean EstEligibleReduction(double pourcentage) {
		return pourcentage>30?false:true;
	}
	
	
	
	
	
	
	

}
