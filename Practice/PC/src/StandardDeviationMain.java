class Deviation {

    double totalNum = 0.0;
    double sdeviation = 0.0;
    double mean = 0.0;
    double res = 0.0;
    double sq = 0.0;

    public double SD()
    {
        int[] arr = { 12, 42, 11, 50, 10, 23, 14, 60 };
        int n = arr.length;

        System.out.println("Elements are:");

        for (int i = 0; i < n; i++)
         {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < n; i++) 
        {
            totalNum = totalNum + arr[i];
        }

        mean = totalNum / n;

        for (int i = 0; i < n; i++)
         {
            sdeviation = sdeviation + Math.pow((arr[i] - mean), 2);
        }

        sq = sdeviation / n;
        res = Math.sqrt(sq);
        return res;

    }
}

public class StandardDeviationMain {

    public static void main(String[] args)
    {
        Deviation d = new Deviation();
        double res = d.SD();
        System.out.println("Standard Deviation =" + res);
    }
}