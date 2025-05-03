public class MaquinaDeBanho {
    private final int MAX_AGUA = 30;
    private final int MAX_SHAMPOO = 10;

    private int nivelAgua = 0;
    private int nivelShampoo = 0;
    private boolean temPet = false;
    private boolean petLimpo = false;
    private boolean precisaLimpar = false;

    public void abastecerAgua() {
        if (nivelAgua + 2 <= MAX_AGUA) {
            nivelAgua += 2;
            System.out.println("Abastecido com 2L de água. Nível atual: " + nivelAgua + "L");
        } else {
            System.out.println("A máquina já está com o nível máximo de água.");
        }
    }

    public void abastecerShampoo() {
        if (nivelShampoo + 2 <= MAX_SHAMPOO) {
            nivelShampoo += 2;
            System.out.println("Abastecido com 2L de shampoo. Nível atual: " + nivelShampoo + "L");
        } else {
            System.out.println("A máquina já está com o nível máximo de shampoo.");
        }
    }

    public void colocarPet() {
        if (temPet) {
            System.out.println("Já tem um pet na máquina.");
        } else if (precisaLimpar) {
            System.out.println("A máquina precisa ser limpa antes de colocar outro pet.");
        } else {
            temPet = true;
            petLimpo = false;
            System.out.println("Pet colocado na máquina.");
        }
    }

    public void retirarPet() {
        if (!temPet) {
            System.out.println("Não há pet na máquina.");
        } else {
            temPet = false;
            if (!petLimpo) {
                precisaLimpar = true;
                System.out.println("Pet retirado sujo. A máquina agora precisa ser limpa.");
            } else {
                System.out.println("Pet retirado limpo.");
            }
        }
    }

    public void darBanho() {
        if (!temPet) {
            System.out.println("Não há pet na máquina para dar banho.");
            return;
        }
        if (nivelAgua < 10 || nivelShampoo < 2) {
            System.out.println("Nível insuficiente de água ou shampoo para dar banho.");
            return;
        }

        nivelAgua -= 10;
        nivelShampoo -= 2;
        petLimpo = true;
        System.out.println("Banho dado com sucesso!");
    }

    public void limparMaquina() {
        if (!precisaLimpar) {
            System.out.println("A máquina não precisa ser limpa.");
            return;
        }
        if (nivelAgua < 3 || nivelShampoo < 1) {
            System.out.println("Nível insuficiente de água ou shampoo para limpar a máquina.");
            return;
        }

        nivelAgua -= 3;
        nivelShampoo -= 1;
        precisaLimpar = false;
        System.out.println("Máquina limpa com sucesso.");
    }

    public void verificarNivelAgua() {
        System.out.println("Nível de água: " + nivelAgua + "L");
    }

    public void verificarNivelShampoo() {
        System.out.println("Nível de shampoo: " + nivelShampoo + "L");
    }

    public void verificarSeTemPet() {
        System.out.println("Tem pet na máquina? " + (temPet ? "Sim" : "Não"));
    }
}
