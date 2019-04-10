package letras.java;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        //char[] letras = {'A','L','V','A','R','O'};

        List<Character> letras = new ArrayList<Character>();

        letras.add('A');
        letras.add('L');
        letras.add('V');
        letras.add('A');
        letras.add('R');
        letras.add('O');


        //Input check
        //-------------------------------------------------------------
        for (char c : letras)
        {
            if (
                    c == 'Á' || c == 'A' || c == 'a' || c == 'á'
                            || c == 'É' || c == 'E' || c == 'e' || c == 'é'
                            || c == 'I' || c == 'Í' || c == 'i' || c == 'í'
                            || c == 'Ó' || c == 'O' || c == 'o' || c == 'ó'
                            || c == 'U' || c == 'Ú' || c == 'u' || c =='ú' )

            {
                System.out.println("VOCAL");
            }
            else if(c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0')
            {
                System.out.println("Els noms de persones no contenen números!");
            }
            else
            {
                System.out.println("CONSONANTE");
            }


        }

        //Map
        //-------------------------------------------------------------
        Map<Character, Integer> map = new HashMap<>();

        //Count the repetition for each character
        for (char c : letras)
        {
            int charCounter = 0;
            Character charToCompare = c;

            for (char c2 : letras)
                if(charToCompare.equals(c2))
                {
                    charCounter++;
                }
            map.put(charToCompare, charCounter);
        }


        //Results
        //-------------------------------------------------------------

        //For iteration using the entrySet of the map (is like a list of the map fields)
        //getKey to retrieve the key and getValue to retrieve the associated value for that key
        for (Map.Entry<Character, Integer> list : map.entrySet())
        {
            System.out.println("Key = " + list.getKey() + ", Value = " + list.getValue());
        }


    }
}
