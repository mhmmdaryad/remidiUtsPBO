public class cpu {
    protected String nama;
    protected int kecepatan;

    cpu (String nama,int kecepatan){
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public String getCPUData(){
        return (this.nama + " " + this.kecepatan + " GHZ");
    }
}