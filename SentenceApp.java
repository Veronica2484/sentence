import javax.swing.JOptionPane;
public class SentenceApp{
	public static void main(String args[]){
	//Declare variables
    String sentence;
    int numWords;

    //Create object
    Sentence myS= new Sentence();

//Input
    sentence=JOptionPane.showInputDialog(null,"Please enter a sentence :");
    myS.setSentence(sentence);


    //Process
	myS.compute();

	//Output
	numWords = myS.getNumWords();


    JOptionPane.showMessageDialog(null,"The sentence has "+sentence+ ", has "+numWords+ "words");

    }
}
