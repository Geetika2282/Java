public class MainBox {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(1);
        int i = box.getValue();

        Box<String> box2 = new Box<>();
        box2.setValue("Hello");
        System.out.println(box2.getValue());
    }
}
