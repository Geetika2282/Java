import java.util.ArrayList;

public class Generic<T1, T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public Generic(int val, T1 t1, T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal(){
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1(){
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2(){
        return t2;
    }

    public void setT2(T2 t2){
        this.t2 = t2;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(55);
        arrayList.add(33);

        int a = (int) arrayList.get(0);
        System.out.println(a);
        Generic<String, Integer> g1 = new Generic(23, "MyString ", 33);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}
