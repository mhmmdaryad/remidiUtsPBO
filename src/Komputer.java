public class Komputer {
    private cpu CPU;

    public Komputer (cpu CPU){
        this.CPU = CPU;
    }

    public Komputer() {
    }
    public void memasang (cpu CPU){
        System.out.println("CPU: "+ CPU.getCPUData()+ " dipasang");
    }

    public void melepas (cpu CPU){
        System.out.println("CPU: "+ CPU.getCPUData()+ " dilepas");
    }

    public void cetakInfo (cpu CPU){
        System.out.println("Spesifikasi: CPU : "+ CPU.getCPUData());
    }
}
