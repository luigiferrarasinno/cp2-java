public class Veiculos {
    public static class Veiculo {
        private String marca;
        private String modelo;
        private int ano;
        private int velocidadeMaxima;
        private int velocidadeAtual;

        public Veiculo(String marca, String modelo, int ano, int velocidadeMaxima) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.velocidadeMaxima = velocidadeMaxima;
            this.velocidadeAtual = 0;
        }


        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public int getVelocidadeMaxima() {
            return velocidadeMaxima;
        }

        public void setVelocidadeMaxima(int velocidadeMaxima) {
            this.velocidadeMaxima = velocidadeMaxima;
        }

        public int getVelocidadeAtual() {
            return velocidadeAtual;
        }

        public void setVelocidadeAtual(int velocidadeAtual) {
            this.velocidadeAtual = velocidadeAtual;
        }

      

        public void acelerar(int incremento) {
            if (velocidadeAtual + incremento <= velocidadeMaxima) {
                velocidadeAtual += incremento;
            } else {
                velocidadeAtual = velocidadeMaxima;
            }
        }

    

        public void reduzirVelocidade(int decremento) {
            if (velocidadeAtual - decremento >= 0) {
                velocidadeAtual -= decremento;
            } else {
                velocidadeAtual = 0;
            }
        }

        

        public void obterStatus() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
            System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
        }
    }

    public static class Carro extends Veiculo {
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

    public static class Moto extends Veiculo {
        public Moto(String marca, String modelo, int ano) {
            super(marca, modelo, ano, 120);
        }

        public void empinar() {
            if (getVelocidadeAtual() > 20 && getVelocidadeAtual() < 50) {
                System.out.println("Empinando a moto!");
            } else {
                System.out.println("Não é possível empinar a moto nessa velocidade.");
            }
        }
    }

    public static class Caminhao extends Veiculo {
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

