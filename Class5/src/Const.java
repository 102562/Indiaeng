public class Const {
    //default constrator method
    int age =10;
    float height = 2.4f;
    double weight =12.20;
    String name ="dog";

    public void moti(){
        System.out.println("Name:" + name);
        System.out.println("Age:" +age);
        System.out.println("Height:" +height);
        System.out.println("Weight:" +weight);
    }
    public static void main(String[] args) {
         Const obj = new Const();
         obj.moti();

    }



}
