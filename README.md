DIAGRAMA DE CLASSE CP2 JAVA
VER NO MODO CODE

rm98047 luigi ferrara sinno




+-------------------------------------+
|               Veiculo               |
+-------------------------------------+

| - marca: String                     |
| - modelo: String                    |
| - ano: int                          |
| - velocidadeMaxima: int             |
| - velocidadeAtual: int              |
+-------------------------------------+

| + Veiculo(marca: String, modelo:   |
|   String, ano: int, velocidadeMaxima:|
|   int)                              |
| + getMarca(): String                |
| + setMarca(marca: String): void     |
| + getModelo(): String               |
| + setModelo(modelo: String): void   |
| + getAno(): int                     |
| + setAno(ano: int): void            |
| + getVelocidadeMaxima(): int        |
| + setVelocidadeMaxima(velocidadeMaxima:|
|   int): void                        |
| + getVelocidadeAtual(): int         |
| + setVelocidadeAtual(velocidadeAtual:|
|   int): void                        |
| + acelerar(incremento: int): void   |
| + reduzirVelocidade(decremento: int):|
|   void                              |
| + obterStatus(): void               |
+-------------------------------------+

                    |
                    |
                    v
+-------------------------------------+

|               Carro                 |
+-------------------------------------+
| - arCondicionado: boolean           |
+-------------------------------------+
| + Carro(marca: String, modelo:      |
|   String, ano: int)                 |
| + ligarArCondicionado(): void      |
| + desligarArCondicionado(): void   |
| + obterStatus(): void               |
+-------------------------------------+

                    |
                    |
                    v
                    
+-------------------------------------+
|               Moto                  |
+-------------------------------------+
+-------------------------------------+
| + Moto(marca: String, modelo:       |
|   String, ano: int)                 |
| + empinar(): void                   |
| + obterStatus(): void               |
+-------------------------------------+

                    |
                    |
                    v
                    
+-------------------------------------+
|             Caminhao                |
+-------------------------------------+
| - capacidadeCarga: double           |
+-------------------------------------+
| + Caminhao(marca: String, modelo:  |
|   String, ano: int)                 |
| + obterStatus(): void               |
+-------------------------------------+
#   c p 2 - j a v a 
 
 obs: mudei algumas coisas no codigo fonte um dia depois que gravei o video e nâo tive tempo de mudar :(
 
