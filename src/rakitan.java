public class rakitan{

    public static void main(String[] args) {

        Komputer komputer1 = new Komputer();
        amd amd1 = new amd(0);
        intel intel1 = new intel(0);

        komputer1.cetakInfo(intel1);
        komputer1.melepas(intel1);
        komputer1.memasang(amd1);
        komputer1.cetakInfo(amd1);
    }

}