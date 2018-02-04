
public class TableForMultiArrays {

	public static void main(String[] args) {
		int firstarray[][]= {{8,9,10,11},{12,13,14,15}};
		int secondarray[][]= {{30,15,24,58,41},{42},{84,74,96,2,415,5},{712,574,4}};
		
		System.out.println("Ez az elsõ tömb:");
		display(firstarray);
		
		System.out.println("Ez a második tömb:");
		display(secondarray);
	}
	
	public static void display(int x[][]) {
		for(int sor=0;sor<x.length;sor++) {
			for(int oszlop=0;oszlop<x[sor].length;oszlop++) {
				System.out.print(x[sor][oszlop]+"\t");
			}
			System.out.println(); //sortörés
		}
	}

}
