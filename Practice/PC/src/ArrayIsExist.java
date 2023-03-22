
class ElementExist {

    public void IsExist() {
        int[] arr = { 12, 20, 50, 60, 3, 30, 44 };

        int find = 55;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("the number " + find + " is present in array");
        } else {
            System.out.println("the number " + find + " is not present in array");
        }
    }
}

public class ArrayIsExist {
    public static void main(String[] args) {
        ElementExist e = new ElementExist();
        e.IsExist();
    }
}