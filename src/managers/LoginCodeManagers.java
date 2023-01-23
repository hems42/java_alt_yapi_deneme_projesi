package managers;

import java.util.Base64;

public class LoginCodeManagers {

    public void encodeLoginCode(){
        String str = "şifrelenmiş";

        // Encode data on your side using BASE64
        byte[] bytesEncoded = Base64.getEncoder().encode(str.getBytes());
        System.out.println("encoded value is " + new String(bytesEncoded));

// Decode data on other side, by processing encoded data
        byte[] valueDecoded = Base64.getDecoder().decode(bytesEncoded);
        System.out.println("Decoded value is " + new String(valueDecoded));
    }

    public void decodeLoginCode(){}
}
