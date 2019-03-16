public class Paraconst {
    int id;
    String name;

    Paraconst(int id,String name){
         this.id=id;
         this.name=name;

    }
    void display(){
        System.out.println(id+ "  " + name);
    }

    public static void main(String[] args) {
        Paraconst o = new Paraconst(10,"djwala");
        o.display();
    }
}
