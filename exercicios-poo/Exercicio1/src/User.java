public class User {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta1 = new ContaBancaria(400
        );

        conta1.consultarSaldo();
        conta1.consultarChequeEspecial();

        conta1.sacar(100);
        System.out.println("Usando cheque especial?" + " " + conta1.estaUsandoChequeEspecial());
        System.out.println("\n");

        conta1.depositar(100);
        conta1.consultarSaldo();
        System.out.println("Usando cheque especial?"+ " " + conta1.estaUsandoChequeEspecial());
        System.out.println("\n");
        
        conta1.pagarBoleto(80);
        conta1.consultarSaldo();
    }
}
