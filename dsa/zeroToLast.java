package dsa;

public class zeroToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// push 0 to the end
				int[] array= {1,2,3,0,0,6,0,8,0,0};
				
				// case 1 left and right non zero
				// case 2 left 0 and right non zero 
				// case 3 left and right both zero, 
				int left=0, right=1;
				for(int i=right; i<array.length; i++) {
					if(array[left]!=0) {
						left++;
						right++;
					}else if(array[right]==0){
						right++;
					}else {
						int temp=array[right];
						array[right]=array[left];
						array[left]=temp;
					}
				}
				for(int i: array){
					System.out.println(i);
				}
				
	}

}
