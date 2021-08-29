public class CountingValleys {

    public static int countingValleys(int steps, String path){
        int totalOfValleys = 0;
        int level = 0, up = 85, down = 68;
        char step;

        for (int i = 0; i < steps; i++)
        {
            //pega proximo step
            step = path.charAt(i);

            if(step  == down)
                level--;

            if (step == up)
                level++;

            if (level == 0 && step == up)
                totalOfValleys += 1;

        }

        //System.out.println(totalOfValleys);
        return totalOfValleys;
    }

    public static void main(String[] args) {
        //System.out.println("salve");
        System.out.println(countingValleys(8,"UDDDUDUU") == 1 );
        System.out.println(countingValleys(12,"DDUUDDUDUUUD") == 2);
        System.out.println(countingValleys(10,"UDUUUDUDDD")== 0 );
       //System.out.println(countingValleys(10,"UDUUUDUDDD"));

    }
}
