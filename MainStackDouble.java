package com.company;

public class MainStackDouble {

    public static void main(String[] args) {
	// write your code here
        stack sk = new stack();
        sk.cetak();

        sk.push(7.9);
        sk.cetak();

        sk.push(80.55);
        sk.cetak();

        sk.push(60.0);
        sk.cetak();

        sk.push(5.9);
        sk.cetak();

        double d1 = sk.pop();
        sk.cetak();

        double d2 = sk.pop();
        sk.cetak();

        double d3 = sk.pop();
        sk.cetak();

        double d4 = sk.pop();
        sk.cetak();





    }
}
