package letras.java;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        //char[] letras = {'A','L','V','A','R','O'};

        List<Character> name = new ArrayList<>();

        name.add('A');
        name.add('l');
        name.add('v');
        name.add('a');
        name.add('r');
        name.add('o');

        List<Character> surname = new ArrayList<>();

        surname.add('D');
        surname.add('e');
        surname.add('l');
        surname.add('g');
        surname.add('a');
        surname.add('d');
        surname.add('o');

        //Input check
        //-------------------------------------------------------------
        for (char c : name)
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
        for (char c : name)
        {
            int charCounter = 0;
            Character charToCompare = c;

            for (char c2 : name)
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
        for (Map.Entry<Character, Integer> mapElement : map.entrySet())
        {
            System.out.println("Key = " + mapElement.getKey() + ", Value = " + mapElement.getValue());
        }


        List<Character> fullName = new ArrayList<>();

        for (char c : name)
        {
            fullName.add(c);
        }

        fullName.add(' ');

        for (char c : surname)
        {
            fullName.add(c);
        }

        for (char c : fullName)
        {
            System.out.print(c);
        }


    }
}
