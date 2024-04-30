import veiculos.*;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Palio", 2020);
        carro.acelerar(100);
        carro.obterStatus(); 

        Moto moto = new Moto("Honda", "CB300R", 2019);
        moto.acelerar(30);
        moto.empinar();
        moto.obterStatus(); 

        Caminhao caminhao = new Caminhao("Volvo", "FH460", 2021);
        caminhao.acelerar(80);
        caminhao.obterStatus(); 
    }
}

