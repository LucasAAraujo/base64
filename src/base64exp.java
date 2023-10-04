import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class base64exp {

    public static void main(String[] args) {
        try {
            String texto = "A classe 64 no Java!";
            System.out.println(texto);

            String textoCodificado = Base64.getEncoder().encodeToString(texto.getBytes(StandardCharsets.UTF_8));
            System.out.println(textoCodificado);

            String textoDecodificado = new String(Base64.getDecoder().decode(textoCodificado), "utf-8");
            System.out.println(textoDecodificado);

        } catch (Exception e) {
        }
    }
}