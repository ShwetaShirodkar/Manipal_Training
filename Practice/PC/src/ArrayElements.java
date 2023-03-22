import java.util.*;

public class ArrayElements {
    
    public void Arrelement(int[] arr1, int [] arr2) 
    {
      
      //Finding common elements in both arrays
      Set<Integer> common = new HashSet<>();
      for(int i = 0; i < arr1.length; i++) {
         for(int j = 0; j < arr2.length; j++) {
            if(arr1[i] == arr2[j]) {
               common.add(arr1[i]);
            }
         }
      }
      System.out.println("Common Elements: " + common);

      //Finding unique elements in first array
      Set<Integer> unique = new HashSet<>();
      for(int i = 0; i < arr1.length; i++) {
         if(!common.contains(arr1[i])) {
            unique.add(arr1[i]);
         }
      }
      System.out.println("Unique Elements: " + unique);
   }
}
