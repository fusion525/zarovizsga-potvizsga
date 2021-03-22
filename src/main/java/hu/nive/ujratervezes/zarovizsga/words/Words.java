package hu.nive.ujratervezes.zarovizsga.words;

public class Words {

    public boolean hasMoreDigits(String s)
    {
        int sumNum = 0;
        int sumLet = 0;

        for (int i = 0; i<s.length(); i++)
        {
            if (Character.isDigit(s.charAt(i)))
            {
                sumNum++;
            }
            if (Character.isAlphabetic(s.charAt(i)))
            {
                sumLet++;
            }
        }

        return sumNum > sumLet;
    }

}
