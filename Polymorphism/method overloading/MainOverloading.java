public class MainOverloading {
    public static void main(String[] args) {
        CalculatorBelanja kalkulator = new CalculatorBelanja();

        System.out.println("Total 2 barang (int)    : Rp" + kalkulator.hitungTotal(10000, 15000));
        System.out.println("Total 3 barang (int)    : Rp" + kalkulator.hitungTotal(5000, 7000, 8000));
        System.out.println("Total 2 barang (double) : Rp" + kalkulator.hitungTotal(12.5, 7.5));
    }
}
