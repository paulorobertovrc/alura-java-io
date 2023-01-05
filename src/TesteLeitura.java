import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("lorem.txt")));
        // BufferedReader buffer = new BufferedReader(new FileReader("lorem.txt"));      

        String linha = buffer.readLine();
        
        while (linha != null) {
            System.out.println(linha);
            linha = buffer.readLine();
        }
        
        buffer.close();
    }
}
