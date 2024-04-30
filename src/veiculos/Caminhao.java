package veiculos;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano, 100);
        this.capacidadeCarga = 1000; 
    }

    @Override
    public void obterStatus() {
        super.obterStatus();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " kg");
    }
}