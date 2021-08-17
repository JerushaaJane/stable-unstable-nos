public class MyClass {
    public static void main(String args[]) {
      
      int n1=12,n2=1313,n3=122,n4=678,n5=898;
      int[]a={n1,n2,n3,n4,n5};
      int[]stable=new int[5];
      int[]unstable=new int[5];
      for(int i=0;i<a.length;i++){
          if(isStable(a[i])==1){
              stable[i]=a[i];
          }
          else{
              unstable[i]=a[i];
          }
          
      }
      System.out.println("Stable nos of array are:");
      for(int i=0;i<stable.length;i++){
          System.out.println(stable[i]);
      }
      
      System.out.println("unstable nos of array are:");
      for(int i=0;i<unstable.length;i++){
          System.out.println(unstable[i]);
      }
      
      System.out.println("max of stable+min of stable= ");
      System.out.println(MaxofStable(stable)+MinofStable(stable));
      
      //boolean stable=isStable(n);
      //if(stable){
      //    System.out.println("stable no");
      //}
      //else{
      //    System.out.println("unstable no");
      //}
      
    }
    static int MaxofStable(int[]a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    static int MinofStable(int[]a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min && a[i]!=0){
                min=a[i];
            }
        }
        return min;
    }
    
    static int isStable(int n){
    int[] freq = new int[10];
    int r = 0;int isStable=1;
    
    while(n>0){
      r=n%10;
      freq[r]++;			
      n=n/10;
    }
    int firstfreq=0;
    for (int i = 0; i < 10; i++) {
		if (freq[i] > 0) {
			firstfreq = freq[i];
			break;
		}
	}
	for (int i = 0; i < 10; i++) {
		if (freq[i] != 0 && freq[i] != firstfreq) {
			isStable = 0;
			break;
		}
	}
	return isStable;
        
    }
    
}
