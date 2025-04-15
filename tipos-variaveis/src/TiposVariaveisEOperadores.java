public class TiposVariaveisEOperadores {
    public static void main(String[] args) {
        // Tipos primitivos
        byte tipoByte = 127;             // -128 a 127
        short tipoShort = 32000;         // -32.768 a 32.767
        int tipoInt = 100000;            // -2 bilhões a 2 bilhões
        long tipoLong = 10000000000L;    // termina com L
        float tipoFloat = 10.5f;         // termina com f
        double tipoDouble = 20.99;       // padrão com ponto decimal
        char tipoChar = 'Z';             // um único caractere
        boolean tipoBoolean = true;      // true ou false

        // Tipo não primitivo (classe)
        String tipoString = "Exemplo de String";

        // Operadores aritméticos
        int a = 10, b = 3;
        System.out.println("Aritméticos:");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        // Operadores relacionais
        System.out.println("\nRelacionais:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Operadores lógicos
        boolean x = true, y = false;
        System.out.println("\nLógicos:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Operadores de atribuição
        int valor = 5;
        System.out.println("\nAtribuição:");
        System.out.println("Valor inicial: " + valor);
        valor += 3;
        System.out.println("+= 3: " + valor);
        valor -= 2;
        System.out.println("-= 2: " + valor);
        valor *= 4;
        System.out.println("*= 4: " + valor);
        valor /= 2;
        System.out.println("/= 2: " + valor);
        valor %= 3;
        System.out.println("%= 3: " + valor);

        // Incremento e decremento
        int contador = 0;
        System.out.println("\nIncremento e Decremento:");
        System.out.println("Contador: " + contador);
        contador++;
        System.out.println("Após contador++: " + contador);
        contador--;
        System.out.println("Após contador--: " + contador);

        // Mostrando todos os tipos
        System.out.println("\nTipos de Variáveis:");
        System.out.println("byte: " + tipoByte);
        System.out.println("short: " + tipoShort);
        System.out.println("int: " + tipoInt);
        System.out.println("long: " + tipoLong);
        System.out.println("float: " + tipoFloat);
        System.out.println("double: " + tipoDouble);
        System.out.println("char: " + tipoChar);
        System.out.println("boolean: " + tipoBoolean);
        System.out.println("String: " + tipoString);
    }
}
