import java.util.*;


class sorting{
	public static void main(String args[]){
		int arr[]={7,8,3,1,2};
		
		//bubble sorting
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-i-1;j++){
				if(arr[i]>arr[i+1]){
					//swap
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}
}