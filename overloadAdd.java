public class overloadAdd {
    public int add(int a, int b){
        System.out.println("2 var: ");
        return a+b;
    }
    public int add(int a, int b, int c){
        System.out.println("3 var: ");
        return a+b+c;
    }
    public int add(int a, int b, int c, int d){
        System.out.println("4 var: ");
        return a+b+c+d;
    }

    public static void main(String[] args) {
        overloadAdd a = new overloadAdd();
        System.out.println(a.add(5, 6));
        System.out.println(a.add(5, 6, 7));
        System.out.println(a.add(5, 6, 7, 8));
    }
}
