class QuickSort {

    /**
     * @param args the command line arguments
     */
    static int partition(int a[],int low,int high){
        int i=low;//index to the first greater element than the chosen pivot element,i.e., last element
        for(int j=low;j<high;j++){
            if(a[j]<=a[high]){
                //swap(a[j],a[i]);
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
                i++;
            }
        }
        int temp=a[i];
        a[i]=a[high];
        a[high]=temp;
        
        return i;
    }
    
    static void quickSort(int a[],int low,int high){
        if(low<high){
        int pivot=partition(a,low,high);
        
        quickSort(a,low,pivot-1);
        quickSort(a,pivot+1,high);  
        }
    }
    
    
    public static void main(String[] args) {
        int a[]={2,5,6,7,8,1,9,3,4};
        for(int k:a)System.out.print(k+"    ");
        System.out.println();
        
        quickSort(a,0,8);
        for(int k:a)System.out.print(k+"    ");
        System.out.println();       
        
        System.out.println(quickSelect(a,0,8,8));
        
        // TODO code application logic here
    }
    
}
