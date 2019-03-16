public class Polym {
    // method overloading
    public static void add(int a,int b,int c){
        int d= a+b+c;
        System.out.println(d);
    }
    public static void add(int a, int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void mult(float a,float b){
        float c =a*b;
        System.out.println(c);
    }
    public void sub(int a,int b){
        int c =a-b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Polym.add(10,20,30);
        Polym.add(222,111);
        Polym.mult(10.1f,20.2f);
        Polym obj = new Polym();
        obj.sub(20,1);

    }
}
