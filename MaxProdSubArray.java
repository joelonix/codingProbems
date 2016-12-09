package cracking.coding.problems;

public class MaxProdSubArray {


	public static void main(String[] args) {
		int a[] = {-2, -3, 0, -2, -40};
		int max= Integer.MIN_VALUE, last_neg_prod=0, prd= 1;
		for(int i=0;i<a.length;i++){
			prd = prd * a[i];
			out:
				if(prd<0){
					if(last_neg_prod<0){ // we have an old -ve product, we can combine these to get a higher +ve product then
						prd = prd*last_neg_prod;
						last_neg_prod = 0; 
						break out;
					}
					last_neg_prod = prd;
					prd = 1;
				}
				else if(prd ==0){
					last_neg_prod = 0;
					prd=1;
				}
			if(max<prd){
				max = prd;
			}
		}

		System.out.println("max prd is:"+max);


	}

}
