import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TesteCopiar {
    public static void main(String[] args) throws IOException {
        BufferedReader readBuffer = new BufferedReader(new FileReader("lorem.txt"));      
        BufferedWriter writeBuffer = new BufferedWriter(new FileWriter("lorem2.txt"));
        
        String linha = readBuffer.readLine();

        while (linha != null) {
            writeBuffer.write(linha);
            writeBuffer.newLine();
            linha = readBuffer.readLine();
        }

        readBuffer.close();
        writeBuffer.close();
    }
}
