import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteReaderContas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            // System.out.println(linha);
            
            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            String tipo = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            float saldo = (float) linhaScanner.nextFloat();

            System.out.println(String.format(new Locale("pt", "BR"), "%s %d %d %s %.2f", tipo, agencia, numero, titular, saldo));
            linhaScanner.close();
        }
        
        scanner.close();
    }
}
