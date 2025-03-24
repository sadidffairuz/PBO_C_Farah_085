import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        Random rand = new Random();
        System.out.println("Pertarungan dimulai!");
        System.out.println("Kesehatan Awal:");
        System.out.println(brimstone.getNama() + ": " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + ": " + viper.getKesehatan());

        while (brimstone.getKesehatan() > 0 && viper.getKesehatan() > 0) {
            if (rand.nextBoolean()) {
                brimstone.serang(viper);
            } else {
                viper.serang(brimstone);
            }

            // Peluang penyembuhan acak
            if (rand.nextInt(100) < 20) { // 20% peluang
                if (rand.nextBoolean()) {
                    brimstone.heal();
                } else {
                    viper.heal();
                }
            }

            // Beri jeda antar aksi (opsional)
            try {
                Thread.sleep(1000); // 1 detik
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Menentukan pemenang
        if (brimstone.getKesehatan() > 0) {
            System.out.println("\nPahlawan " + brimstone.getNama() + " memenangkan pertarungan!");
        } else {
            System.out.println("\nMusuh " + viper.getNama() + " memenangkan pertarungan!");
        }
    }
}