import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        int aloneSocks = 0, qtd, pairs =0;
        //System.out.println(ar);
        //Map<int, int> meias = new HashMap<int, int>();

        Map<Integer, Integer> meias = new HashMap<>();

        for(int value: ar)
        {
            if(meias.get(value) == null )
            {
                meias.put(value,1);
            }
            else
            {
                qtd = meias.get(value);
                qtd += 1 ;
                meias.put(value,qtd);
            }
        }

        System.out.println(meias);

        for(int key : meias.keySet())
        {
            qtd = meias.get(key);
            if(qtd % 2 != 0)
            {
                qtd -= 1;
                aloneSocks++;
                pairs += qtd / 2;
            }
            else
            {
                pairs += qtd / 2;
            }
        }
        return pairs;
    }




    public static void main(String[] args) {
        System.out.println("Hello world!");

        int n = 10;
        List<Integer> ar = Arrays.asList(1,1,3,1,2,1,3,3,3,3);

        int result = sockMerchant(n, ar);

        System.out.println("Single Socks: " + result);

    }
}
