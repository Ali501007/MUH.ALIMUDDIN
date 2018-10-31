package com.company;

public class MainQueueFloat {
    public static void main(String[] args) {
        queue q = new queue();
        q.cetak();

        q.insert((float)66.399);
        q.cetak();
        q.insert((float)7.907);
        q.cetak();
        q.insert((float)6757.36);
        q.cetak();

        float a1 = q.get();
        q.cetak();

        float a2 = q.get();
        q.cetak();

        float a3 = q.get();
        q.cetak();

    }
}
