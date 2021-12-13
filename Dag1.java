import static java.lang.System.*; //for println
import static java.lang.Integer.*; 
import java.util.*; // for arrays, scanner, etc
import java.io.*; // for reading and writing files

public class Dag1{
	public static void main(String[] args) throws Exception{
		File fil = new File("input1.txt");
		Scanner reader = new Scanner(fil);

		int forrige = reader.nextInt();
		int nåtall = 0;
		int antall = 0;
		int teller = 1;

		while(reader.hasNextInt()){
			nåtall = reader.nextInt();
			if(nåtall > forrige){
				antall++;
			}
			forrige = nåtall;
			teller++;
		}
		reader.close();
		out.println("Antall økninger: " + antall);

// Del 2
		
		reader = new Scanner(fil);
		int[] dataSett = new int[teller];
		//int[] dataSum = new int[antall -2];

		for(int i=0;i<teller;i++){
			dataSett[i] = reader.nextInt();
		}

		reader.close();

		int forrigeSum = 0;
		int nesteSum = 0;
		int øker = 0;
		int j = 2;

		for(int i=0;i<dataSett.length;i++){
			forrigeSum = dataSett[j] + dataSett[j-1] + dataSett[j-2];
			j++;
			if(j>=1999){
				i = dataSett.length;
			}
			nesteSum = dataSett[j] + dataSett[j-1] + dataSett[j-2];
			if(nesteSum>forrigeSum){
				øker++;
			}
		}

		System.out.println("Økninger i 3-serie: " + øker);


/*		


		for(int i=0;i<antall;i++){
			dataSett[i] = reader.nextInt();
			if(i >= 2){
				dataSum[i-2] = dataSett[i] + dataSett[i-1] + dataSett[i-2];
			}
		}
		int antallSum = 0;
		for(int i = 0; i < dataSum.length;i++){
			if(dataSum[i] > dataSum[i]){
				antallSum++;
			}
		}
		System.out.println("Antall økninger i 3sum: " + antallSum);
		
 AVSTANDSFORMELEN FRA EKSAMENSOPPGAVER
		double del1 = Math.pow(x-BREDDE/2,2); //xUtregning, siste komma er hva det opphøyes i
		double del2 = Math.pow(y-HØYDE/2,2); //yUtregning
		double avstand = Math.sqrt(del1+del2)
*/
	}
}