package veiculos;

public class Carro extends Veiculo {
    private boolean arCondicionado;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano, 180);
        this.arCondicionado = false;
    }

    public void ligarArCondicionado() {
        this.arCondicionado = true;
    }

    public void desligarArCondicionado() {
        this.arCondicionado = false;
    }

    @Override
    public void obterStatus() {
        super.obterStatus();
        System.out.println("Ar Condicionado: " + (arCondicionado ? "ligado" : "desligado"));
    }
}