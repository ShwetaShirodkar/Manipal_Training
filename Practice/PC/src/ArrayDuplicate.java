 
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate {
    
    public boolean containsDuplicates(Integer[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)) return true;
            set.add(num);
        }

        return false;
    }
}

