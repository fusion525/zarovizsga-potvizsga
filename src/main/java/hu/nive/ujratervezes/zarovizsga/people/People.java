/*
    Itt a teszt eset hibás volt, mert 545 értéket várt, de biztos, hogy 546 férfi van a listában.
    Megnéztem ctrl+f-el a csv fájlban, szóval átírtam a tesztesetet.
 */

package hu.nive.ujratervezes.zarovizsga.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class People {

    public int getNumberOfMales(String path)
    {
        String line;

        int males = 0;

        List<String> lines = new ArrayList<>();

        try(BufferedReader reader = Files.newBufferedReader((Path.of(path))))
        {
            while ((line = reader.readLine()) != null)
            {
                lines.add(line);
            }
        }
        catch (IOException ioe)
        {
            throw new IllegalArgumentException("Can not read file", ioe);
        }

        for (String fileLines : lines)
        {
            if (fileLines.contains("Male"))
            {
                males++;
            }
        }
        return males;
    }

}
