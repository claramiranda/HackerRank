import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {


    public static int jumpingOnTheClouds(List<Integer> c){
        int jump = 0;
        int size = c.size()-1;
        int index = 0;

        while(index < size){
            if(index + 2 <= size  && c.get(index + 2) == 0)
            {
                jump++;
                index += 2;
            }
            else
            {
                index++;
                jump++;
            }
        }
        return jump;
    }


    public static void main(String[] args) {

        List<Integer> c = Arrays.asList(0,0,1,0,0,1,0);
        System.out.println( jumpingOnTheClouds(c) == 4);

        c = Arrays.asList(0,0,0,1,0,0);
        System.out.println( jumpingOnTheClouds(c) == 3);




    }

}



