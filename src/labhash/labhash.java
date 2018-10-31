package labhash;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class labhash {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        String mje = "Este es un mensaje de prueba de integridad";

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashInBytes = md.digest(mje.getBytes(StandardCharsets.UTF_8));

		// bytes to hex
        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        System.out.println("el mensaje original es: "+mje);
        System.out.println("el hash del mensaje es: "+sb.toString());

    }}