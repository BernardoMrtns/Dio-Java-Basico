public class Carro {
    private boolean ligado = false;
    private int marcha = 0;
    private int velocidade = 0;

    public void ligar(){
        if(!ligado){
            ligado = true;
            System.out.println("CARRO LIGADO");
        } else {
            System.out.println("O CARRO JA ESTA LIGADO");
        }
    }

    public void desligar(){
        if(ligado && marcha == 0 && velocidade == 0){
            ligado = false;
            System.out.println("CARRO DESLIGADO");
        } else {
            System.out.println("NÃO É POSSIVEL DESLIGAR O CARRO. VERIFIQUE SE ESTA PARADO E COM PONTO MORTO");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro deve estar ligado para acelerar.");
            return;
        }
        if (marcha == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }

        if (velocidade < 120) {
            int novaVelocidade = velocidade + 1;
            if (velocidadeDentroDaMarcha(novaVelocidade, marcha)) {
                velocidade = novaVelocidade;
                System.out.println("Velocidade: " + velocidade + "km/h");
            } else {
                System.out.println("Velocidade não permitida para a marcha atual.");
            }
        } else {
            System.out.println("Velocidade máxima atingida.");
        }
    }

    public void desacelerar() {
        if (!ligado) {
            System.out.println("O carro deve estar ligado para desacelerar.");
            return;
        }
        if (velocidade > 0) {
            velocidade--;
            System.out.println("Velocidade: " + velocidade + "km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void subirMarcha() {
        if (!ligado) {
            System.out.println("O carro deve estar ligado para trocar de marcha.");
            return;
        }
        if (marcha < 6) {
            marcha++;
            System.out.println("Marcha: " + marcha);
        } else {
            System.out.println("Marcha máxima atingida.");
        }
    }

    public void abaixarMarcha() {
        if (!ligado) {
            System.out.println("O carro deve estar ligado para trocar de marcha.");
            return;
        }
        if (marcha > 0) {
            marcha--;
            System.out.println("Marcha: " + marcha);
        } else {
            System.out.println("Já está em ponto morto.");
        }
    }

    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para " + direcao);
        } else {
            System.out.println("Velocidade inadequada para virar.");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + "km/h");
    }

    private boolean velocidadeDentroDaMarcha(int vel, int marcha) {
        return switch (marcha) {
            case 1 -> vel >= 0 && vel <= 20;
            case 2 -> vel >= 21 && vel <= 40;
            case 3 -> vel >= 41 && vel <= 60;
            case 4 -> vel >= 61 && vel <= 80;
            case 5 -> vel >= 81 && vel <= 100;
            case 6 -> vel >= 101 && vel <= 120;
            default -> false;
        };
    }
}