public class FinnNumber{
	int myNumber;
	int iterations;
	float x;
	
	public FinnNumber(int i){
		this.myNumber = i;
	}
	
	public void setPointX(int i){
		this.x = i;
	}
	
	public void setIterations(int i){
		this.iterations = i;
	}		
	
	public int giveValue(){
		return myNumber;
	}
	
	public void calcBaby(){
		for(int i=1; i<=iterations; i++){
			//System.out.println("Iteration number " + i + " and the current x is " + this.x);
			this.x = (float) (0.5 * (this.x + (this.myNumber/this.x)));
		}
	}
}
