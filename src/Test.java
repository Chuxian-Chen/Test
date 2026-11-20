import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {
    static void main() {
        BigInteger ans = new BigInteger("0");
        BigInteger bi = new BigInteger("2");
        for (int i = 1; i < 300; i++) {
            ans = ans.add(bi);
            bi = bi.multiply(new BigInteger("2"));
        }
        System.out.println(ans);
    }
}
