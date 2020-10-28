package sorts;

public class MergeSort {
	private void sort(int a[], int[] leftArray, int[] rightArray, int lLen, int rLen) {
		int i=0,l=0,r=0;
		while(l<lLen && r<rLen) {
			if(leftArray[l]<rightArray[r]) {
				a[i++]=leftArray[l++];
			}
			else if(leftArray[l]>rightArray[r]) {
				a[i++]=rightArray[r++];
			}
		}
		while(l<lLen) {
			a[i++]=leftArray[l++];
		}
		while(r<rLen) {
			a[i++]=rightArray[r++];
		}
	}
	protected void mergeSort(int a[],int aLen) {
		try {
			if(aLen<2) {
				return;
			}
			int mid=aLen/2;		
			int[] leftArray=new int[mid];
			int[] rightArray=new int[aLen-mid];
			int k=0;
			for(int i=0;i<aLen;i++) {
				if(i<mid) {
					leftArray[i]=a[i];
				}
				else {
					rightArray[k++]=a[i];
				}
			}
			mergeSort(leftArray,mid);
			mergeSort(rightArray,aLen-mid);
			sort(a,leftArray,rightArray,mid,aLen-mid);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
