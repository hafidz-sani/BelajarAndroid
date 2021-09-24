package com.hafidzproject.basicandroid.data;

public class Bilangan {


    public String getBilanganGanjil(){
        int nilaiAwal = 1;
        String hasilGanjil = String.valueOf(nilaiAwal);

        for (int i = 0; i < 10; i++) {
            nilaiAwal = nilaiAwal + 2;
            hasilGanjil = hasilGanjil + ", " + nilaiAwal;
        }

        return hasilGanjil;
    }

    protected String getBilanganFibonacci(){
        int n = 15;
        String hasilFibonacci= "";

        for (int i = 1; i < n-1; i++) {
            hasilFibonacci = hasilFibonacci + ", " + String.valueOf(fibonacci(i));
        }

        return hasilFibonacci;
    }

    public int fibonacci(int n){
        if (n==1)
            return 1;
        else if(n==2)
            return 2;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
