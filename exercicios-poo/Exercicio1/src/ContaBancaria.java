public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double chequeEspecialUtilizado;

public ContaBancaria(double depositoInicial){
    this.saldo = depositoInicial;
    if(depositoInicial <= 500){
        this.chequeEspecial = 50.0;
     } else {
        this.chequeEspecial = depositoInicial * 0.5;
     }
     this.chequeEspecialUtilizado = 0.0;
}

public void consultarSaldo(){
    System.out.println("SALDO DISPONIVEL: " + "R$" + saldo);
}

public void consultarChequeEspecial(){
    System.out.println("LIMITE DO CHEQUE ESPECIAL: " + "R$" + chequeEspecial);
}

public void depositar(double valor){
    if(chequeEspecialUtilizado > 0){
        double taxa = chequeEspecialUtilizado * 0.2;
        double totalDevido = chequeEspecialUtilizado + taxa;

        if(valor>=totalDevido){
            valor -= totalDevido;
            chequeEspecialUtilizado = 0;
            System.out.println("R$" + totalDevido + " usado para quitar o cheque espericial, incluido a taxa de R$" + taxa);
        } else { 
            double usado = valor/1.2;
            chequeEspecialUtilizado -= usado;
            System.out.println("R$" + valor + " usado parcialmente para quitar o cheque especial. R$" + usado + " Quitado");
        }
    }
    saldo += valor;
    System.out.println("Deposito de R$" + valor + " realizado com sucesso");
}

public boolean sacar(double valor){
    if(valor <= saldo){
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso");
        return true;
    } else if (valor <= saldo + chequeEspecial - chequeEspecialUtilizado){
        double restante = valor - saldo;
        saldo = 0;
        chequeEspecialUtilizado += restante;
        System.out.println("Saque de R$" + valor + " realizado usando R$" + restante + " do cheque especial");
        return true;
    } else { 
        System.out.println("SALDO INSUFICIENTE");
        return false;
    }
}

public boolean pagarBoleto(double valor){ 
    System.out.println("Processando pagamento no valor de R$" + valor + "...");
    return sacar(valor);
}

public boolean estaUsandoChequeEspecial(){
    return chequeEspecialUtilizado > 0;
}
}