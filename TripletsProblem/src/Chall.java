//solve this challenge using List
import java.util.ArrayList;
import java.util.List;

public class Chall {

    public static void main(String [] args)
    {
        List<Integer>alice = new ArrayList<Integer>(3);
        List<Integer>bob = new ArrayList<>(3);

        System.out.println("Clarity,   originality,  difficulty");
        alice.add(1);
        alice.add(2);
        alice.add(3);

        bob.add(3);
        bob.add(2);
        bob.add(1);
        System.out.println(results(alice, bob));

    }
    //compare the results
    public static List<Integer>results(List<Integer>a,List<Integer>b)
    {
        //loop thro the list

        int aScore = 0;
        int bScore = 0;
        for(int i=0; i<3;i++)
        {
            if(a.get(i) > b.get(i)) aScore +=1;
            else if(b.get(i)>a.get(i)) bScore +=1;
        }
        List<Integer>results = new ArrayList<>(2);
        results.add(aScore);
        results.add(bScore);
        // System.out.println(results);
        return results;

    }
    
}
