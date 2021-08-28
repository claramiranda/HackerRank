public class CountingValleys {

    public static int countingValleys(int steps, String path){
        int totalOfValleys = 0;
        int level = 0;
        char step;
        boolean alreadyValley = false;

        for (int i = 0; i < steps; i++)
        {
            //pega próximo step
            step = path.charAt(i);

            //
            if( step  == 68){
                //System.out.println(step);
                level--;
                if (!alreadyValley && i < (steps - 1) && i != 0){
                    totalOfValleys += 1;
                    System.out.println("new valley!");
                    alreadyValley = true;
                }
            }
            else{
                //if( step  == 85){
                    //System.out.println(step);
                    level++;
                    //alreadyValley = level == 0 ? true : false;
                    if (level == 0){
                        alreadyValley = false;
                    }
                //}
            }


            //System.out.println("step:" + step + " level: " + level);
        }
        //System.out.println("totalOfValleys: " + totalOfValleys );
        return totalOfValleys;
    }

    public static void main(String[] args) {
        //System.out.println("salve");
        System.out.println(countingValleys(8,"UDDDUDUU") == 1 ? true : false);
        System.out.println(countingValleys(12,"DDUUDDUDUUUD") == 2 ? true : false);
        System.out.println(countingValleys(12,"") == 2 ? true : false);

    }
}
