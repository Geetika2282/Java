class Child implements Father, Mother{
    @Override
    public float height() {
        float ht = (Father.HT + Mother.HT)/ 2;
        return ht;
    }
}
