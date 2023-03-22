
public class RotationEqaulity {
    
    public boolean isRotationEqual(String s1, String s2) {
        String rev = reverse(s2);
        return s1.equals(rev);
    }

    private String reverse(String str) {
        String st = "";

        for (int i = str.length()-1; i >= 0; i--) {
            st += str.charAt(i);
        }

        return st;
    }
    
}