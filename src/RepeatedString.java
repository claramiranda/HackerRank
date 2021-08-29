public class RepeatedString {

     public static boolean isThisCharA(char letter){
        return letter == 97;
    }

    public static int letterACounter(String s){
         int a = 0;
         int size = s.length();

         for(int i=0; i < size; i++)
         {
             if (isThisCharA(s.charAt(i)))
                 a++;
         }
         return a;
    }



    public static long repeatedString(String s, long n){
        long rep = letterACounter(s);
        int size = s.length();
        long resto = n % size;

        long subs = (n - resto) / size;

        long total = (subs * rep);

        if (resto != 0){
            String substring = s.substring(0, (int) resto);
            total += letterACounter(substring);
        }

        return total;
    }

    public static void main(String[] args) {
        String s = "aba";
        long n = 10L;

        System.out.println(repeatedString("aba",10L) == 7);

        System.out.println(repeatedString("a",1000000000000L) == 1000000000000L );


    }
}
