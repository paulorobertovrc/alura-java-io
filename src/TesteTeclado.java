import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteTeclado {
    public static void main(String[] args) throws IOException {
        BufferedReader readBuffer = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writeBuffer = new BufferedWriter(new FileWriter("lorem2.txt"));
        
        String linha = readBuffer.readLine();

        while (linha != null && !linha.isEmpty()) {
            writeBuffer.write(linha);
            writeBuffer.newLine();
            linha = readBuffer.readLine();
        }

        readBuffer.close();
        writeBuffer.close();
    }
}
