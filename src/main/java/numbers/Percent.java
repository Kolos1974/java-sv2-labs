package numbers;

public class Percent {
    public double getValue(int a, int b){
        return a*(b/100.0);
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        System.out.println(percent.getValue(200, 30));
        System.out.println();
        System.out.println(percent.getBase(60, 30));
        System.out.println();
        System.out.println(percent.getPercent(100, 200));
        System.out.println(percent.getPercent(10, 56));
        System.out.println(percent.getPercent(60, 40));

    }

    public double getBase(int a, int b){
        return ((double) a/b)*100;
    }

    public double getPercent(int a, int b){
        return ((double) b/a)*100;
    }

}
