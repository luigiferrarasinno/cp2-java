package veiculos;

public class Moto extends Veiculo {
    private boolean empinando;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano, 120);
        this.empinando = false;
    }

    public void empinar() {
        if (getVelocidadeAtual() > 20 && getVelocidadeAtual() < 50) {
            System.out.println("Empinando a moto!");
            this.empinando = true;
        } else {
            System.out.println("Não é possível empinar a moto nessa velocidade.");
        }
    }

    public void desempinar() {
        System.out.println("Desempinando a moto!");
        this.empinando = false;
    }

    @Override
    public void obterStatus() {
        super.obterStatus();
        System.out.println("Empiando = " + (this.empinando ? "Sim" : "Não"));
    }
}