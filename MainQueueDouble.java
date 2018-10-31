public class MainQueueDouble {
    public static void main(String[] args) {
        queue q = new queue();
        q.cetak();

        q.insert(9.5);
        q.cetak();
        q.insert(66.50);
        q.cetak();
        q.insert(11.55);
        q.cetak();

        double a1 = q.get();
        q.cetak();

        double a2 = q.get();
        q.cetak();

        double a3 = q.get();
        q.cetak();

    }
}
