import java.util.Arrays;
import java.util.List;

//public class DemoString {
//    public static void main(String[] args) {
//
//        StringDemo toLower = (n) -> n.toLowerCase();
//        StringDemo toUpper = (n) -> n.toUpperCase();
//        StringDemo isReverse = (n) -> {
//            String res = "";
//            for (int i = n.length()-1; i>=0;i--)
//                res+=n.charAt(i);
//            return res;
//        };
//        System.out.println(toLower.test("HeLlo wOrLd"));
//        System.out.println(toUpper.test("HeLlo wOrLd"));
//        System.out.println(isReverse.test("Hello"));
//    }
//}
public class DemoString {
    public String operateOnStr(StringDemo p,String s){
        return p.test(s);
    }

    public static void main(String[] args) {

        DemoString demo = new DemoString();
        String toupper = demo.operateOnStr((s) -> s.toUpperCase(), "Lambda");
        System.out.println(toupper);

        String toLower = demo.operateOnStr((s) -> s.toLowerCase(),"hElLo WoRlD!");
        System.out.println(toLower );


    }
}