public class App
 {
  
    public static void longestSubString() {
        LongestSubstring ls = new LongestSubstring();
        // System.out.println("Longest " + ls.longestSubString("abcabbccbbr") );
        // ls.longestSubString("rarxbzatyrqw");
        System.out.println("Longest " + ls.longestSubString("rar") );
    }

    public static void rotationEquality() {

        RotationEqaulity roEq = new RotationEqaulity();

        String sts1 = roEq.isRotationEqual("abc", "bbc") ? "bbc is rotation of abc" : "bbc is not a roatation of abc";
        System.out.println(sts1);

        String sts2 = roEq.isRotationEqual("aa", "aa") ? "aa is rotation of aa" : "aa is not a roatation of aa";
        System.out.println(sts2);

        String sts3 = roEq.isRotationEqual("a", "b") ? "b is rotation of a" : "b is not a roatation of a";
        System.out.println(sts3);

        String sts4 = roEq.isRotationEqual("a", "a") ? "a is rotation of a" : "a is not a roatation of a";
        System.out.println(sts4);

        String sts5 = roEq.isRotationEqual("abcpqr", "rqpcba") ? "rqpcba is rotation of abcpqr" : "rqpcba is not a roatation of abcpqr";
        System.out.println(sts5);
    } 
    

    public static void CharacterCount() {
        CharacterCount cc = new CharacterCount();
        String op1 = cc.countChars("aaatttaeee");
        String sts1 = op1.equals("a4,t3,e3") ? "✅ Correct " : "❌ Wrong";
        System.out.println(sts1);

        String op2 = cc.countChars("qwqwwwqw");
        String sts2 = op2.equals("q3,w5") ? "✅ Correct " : "❌ Wrong";
        System.out.println(sts2);
        
    }

    public static void RemoveCharacter() {

        RemoveCharacter rc = new RemoveCharacter();
        
        System.out.println("Answer (abcpqr)"+ rc.removeCharacter("abcxpqr", "x"));
        System.out.println("There is no x in string"+ rc.removeCharacter("abcpqr", "x"));
        System.out.println("Invalid Strinf"+ rc.removeCharacter("", "x"));
        System.out.println("Specify the character to be removed"+ rc.removeCharacter("abcxpqr", ""));
        System.out.println("Answer (ab) "+ rc.removeCharacter("axb", "x"));
        System.out.println("Answer (nothing remains) "+ rc.removeCharacter("x", "x"));
        System.out.println("Answer (x) "+ rc.removeCharacter("xx", "x"));
        System.out.println("Answer (abcpqr)"+ rc.removeCharacter("axbcxpqr", "x"));
    }

    public static void ArrayElements() {
        ArrayElements a = new ArrayElements();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
    }
    public static void containsDuplicate() {
        ArrayDuplicate ad = new ArrayDuplicate();
        System.out.println( ad.containsDuplicates(new Integer[]{1 ,8, 9, 7}));;
        System.out.println( ad.containsDuplicates(new Integer[]{1 , 7 ,8, 9, 7}));;
    }
    public static void Array2d(){
        int[][] arr = {
            { 1, 1, 1 },
            { 1, 1 },
            { 1, 4, 5, 6 }}
       
    Array2d a = new Array2d(arr);
    int sum = a.sum();
    
    System.out.println("Sum of all elements: " + sum);

    }

    public static void main(String[] args) throws Exception {
        
        //CharacterCount c = new CharacterCount();
        //c.countChars(null);
        //RemoveCharacter();
        //rotationEquality();
        //ArrayElements();
        //containsDuplicate();
        Array2d();
    }
}
