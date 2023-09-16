package atividade5;

class Veiculo {
    private String marca, modelo;
    private int anoFabricacao;

    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }

    public void frear() {
        System.out.println("O veículo está freando.");
    }

    public void imprimirDados() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nAno de Fabricação: " + anoFabricacao);
    }
}

class Carro extends Veiculo {
    public Carro(String marca, String modelo, int anoFabricacao, int numPortas) {
        super(marca, modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando, aumentando constantemente sua velocidade.");
    }
}

class Moto extends Veiculo {
    public Moto(String marca, String modelo, int anoFabricacao, boolean possuiPartidaEletrica) {
        super(marca, modelo, anoFabricacao);
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando com frenagem ABS.");
    }
}

class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo, int anoFabricacao, int numMarchas) {
        super(marca, modelo, anoFabricacao);
    }
}

public class Executavel {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Chevrolet", "Cruze", 2021, 4);
        Moto minhaMoto = new Moto("Yamaha", "R1", 2022, true);
        Bicicleta minhaBicicleta = new Bicicleta("Trek", "X-Caliber", 2020, 18);

        meuCarro.imprimirDados();
        meuCarro.acelerar();

        System.out.println();

        minhaMoto.imprimirDados();
        minhaMoto.frear();

        System.out.println();

        minhaBicicleta.imprimirDados();
    }
}

