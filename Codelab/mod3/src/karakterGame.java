import java.util.Random;

abstract class KarakterGame {
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = Math.max(kesehatan, 0);
    }

    public abstract void serang(KarakterGame target);

    public void heal() {
        Random rand = new Random();
        int healAmount = rand.nextInt(11) + 10;
        this.kesehatan += healAmount;
        System.out.println(this.nama + " menyembuhkan diri sendiri sebesar " + healAmount + " poin! Kesehatan sekarang: " + this.kesehatan);
    }
}


class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        Random rand = new Random();
        boolean isCritical = rand.nextInt(100) < 20;
        int damage = isCritical ? 40 : 20;

        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
        if (isCritical) {
            System.out.println("Serangan kritis! Kerusakan meningkat!");
        }
        target.setKesehatan(target.getKesehatan() - damage);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}


class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        Random rand = new Random();
        int damage = 15 + rand.nextInt(6);

        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        target.setKesehatan(target.getKesehatan() - damage);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}


