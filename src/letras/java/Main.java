package letras.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List <Character> letras = new ArrayList<>();

        letras.add('Á');
        letras.add('L');
        letras.add('V');
        letras.add('A');
        letras.add('R');
        letras.add('O');

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
    }
}
