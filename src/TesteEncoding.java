import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "ç";
        System.out.println(s.codePointAt(0));

        Charset c = Charset.defaultCharset();
        System.out.println(c.displayName());

        byte[] bytes = s.getBytes(c);
        System.out.println(bytes.length);
        String sNovo = new String(bytes);
        System.out.println(sNovo);
    }
}
