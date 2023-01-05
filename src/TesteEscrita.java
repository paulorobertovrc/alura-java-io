import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        // BufferedWriter buffer = new BufferedWriter(new FileWriter("lorem.txt"));
        PrintStream ps = new PrintStream("lorem3.txt");
        ps.print("Lorem ipsum dolor sit amet, consectur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.print("Teste");
        ps.close();

        /*
        buffer.write("teste 123");
        buffer.newLine();
        buffer.write("mais um teste");
        buffer.write(System.lineSeparator());
        buffer.write("Lorem ipsum dolor sit amet, consectur adipiscing elit, sed do eiusmod");
        buffer.close();
        */
    }
}
