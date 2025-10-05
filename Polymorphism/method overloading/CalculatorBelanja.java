// Class untuk menghitung total belanja
public class CalculatorBelanja {

    // Overloading 1: dua barang bertipe int
    public int hitungTotal(int harga1, int harga2) {
        return harga1 + harga2;
    }

    // Overloading 2: tiga barang bertipe int
    public int hitungTotal(int harga1, int harga2, int harga3) {
        return harga1 + harga2 + harga3;
    }

    // Overloading 3: dua barang bertipe double (harga desimal)
    public double hitungTotal(double harga1, double harga2) {
        return harga1 + harga2;
    }
}
