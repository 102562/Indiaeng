public class polyoverriding {
    //overriding parameters
    public void add(int a,int b){
        int c= a+b;
        System.out.println(c);
    }
    class child extends polyoverriding{
        public void sub(int a, int b){
            int c =a-b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        polyoverriding obj = new polyoverriding();
        obj.add(50,60);
    }
}
