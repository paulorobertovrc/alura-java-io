import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws Exception {
        // String nome = "Paulo Roberto";
        
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        // oos.writeObject(nome);
        // oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome = (String) ois.readObject();
        System.out.println(nome);
        ois.close();
    }
}
