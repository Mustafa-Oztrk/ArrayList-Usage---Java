import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList, birden fazla değeri saklayabilen bir veri yapısıdır.
        // ArrayList içerisinde farklı veri tiplerini tutabilirsiniz.
        // İçerisine hangi veri tiplerini saklamak isterseniz onları ekleyebilirsiniz.

        ArrayList<Object> hayvanlar = new ArrayList<>();
        hayvanlar.add("Köpek");
        hayvanlar.add("Kedi");
        hayvanlar.add(10);

        // Ekrana ArrayList'in kaç tane eleman içerdiğini yazar.
        System.out.println(hayvanlar.size());

        // ArrayList içindeki belirli bir indeksteki elemanı siler.
        System.out.println(hayvanlar.remove(0));

        // ArrayList içindeki tüm elemanları siler.
        hayvanlar.clear();

        // ArrayList içinde belirli bir indeksteki elemanı değiştirir.
        hayvanlar.set(0, "balık");

        // ArrayList'ı farklı veri tipleri ile tanımlayabilirsiniz.
        ArrayList<Object> evcilHayvanlar = new ArrayList<>();
        evcilHayvanlar.add("Köpek");
        evcilHayvanlar.add("Kedi");

        // ArrayList içinde sadece belirli bir veri tipini saklamak için tür belirtilebilir.
        ArrayList<Integer> dogumTarihi = new ArrayList<>();
        dogumTarihi.add(2003);
        dogumTarihi.add(2005);

        // String dizisi oluşturmak için:
        String[] isimler = new String[]{"Sude", "Mustafa", "Ebru", "Asiye"};

        // Integer dizisi oluşturmak için:
        Integer[] yaslar = new Integer[]{20, 15, 30};
    }
}
