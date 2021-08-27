public class MyClass {
    public static void main(String args[]) {
      int arr[];
      arr=new int[]{1,2,3,4,5};
      int large ,small;
      large=arr[0];   // assign first value as largest value
      small=arr[0];   // assign first value as smallest value 
      for(int i=1; i<5;++i){
          if(arr[i]>large){
              large=arr[i];    // update larger value
          }
          if(a[i]<small){
              small=arr[i];    // update smaller value
          }
      }
            System.out.println("Smallest number in array is  " + small);
      System.out.println("Largest number in array is  " + large);

    }
}
