public class StrBuilder {
    public boolean isPal(String txt){
        StringBuilder s = new StringBuilder(txt);
        s.reverse();
        String reversed = s.toString();
        return txt.equals(reversed);
    }
    public static void main(String[] args) {
        StrBuilder s1 = new StrBuilder();

//        Using StringBuilder so can edits Strings (mutable)
     System.out.println(s1.isPal("arbra"));
     StringBuilder sb = new StringBuilder();
     for(int i=0; i<26; i++){
         char ch = (char) ('a'+i);
         sb.append(ch);
     }
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
    }

}
