public class Sentence{

	//Declare variables
    private String sentence;
    private int numWords;

    //Constructor
    public Sentence(){
		sentence =" ";
		numWords = 1;
	}

	//compute
	 public void compute(){
		 for(int i=0; i < sentence.length(); i++){
			 if(sentence.charAt(i) == ' '){
				 numWords++;
			}
		 }

	}
	//getters
     public int getNumWords(){
			return numWords;
	}
	//setters

  	public void setSentence(String sentence){
    this.sentence = sentence;

  	}
}