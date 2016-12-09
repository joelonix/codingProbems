package cracking.coding.problems;

public class NamesSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[]={"Joel","Onyx","Ajay","Roy"};
		String temp;
		
		for (int i = 0; i < names.length; i++) {
			
			for (int j = i+1; j < names.length; j++) {
				
				if(names[i].compareTo(names[j])>0){
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
					
				}
				
			}
			
		}
		
		for (int i = 0; i < names.length; i++) {
			
			System.out.println(names[i]+"\t");
			
		}

	}

}
