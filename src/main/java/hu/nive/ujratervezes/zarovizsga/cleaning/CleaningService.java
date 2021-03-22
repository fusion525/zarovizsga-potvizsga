package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CleaningService {

    private List<Cleanable> properties = new ArrayList<>();

    public void add(Cleanable cleanable)
    {
        properties.add(cleanable);
    }

    public List<Cleanable> getCleanables()
    {
        return properties;
    }

    public int cleanAll()
    {

        int price = 0;

        Iterator<Cleanable> it = properties.iterator();

        while(it.hasNext())
        {
            price += it.next().clean();
            it.remove();
        }

        return price;
    }

    public int cleanOnlyOffices()
    {
        int price = 0;

        Iterator<Cleanable> it = properties.iterator();

        while(it.hasNext())
        {
            Cleanable office = it.next();

            if (office instanceof Office)
            {
                price += office.clean();
                it.remove();
            }

        }

        return price;
    }

    public List<Cleanable> findByAddressPart(String address)
    {
        List<Cleanable> foundProperties = new ArrayList<>();

        for (Cleanable property : properties)
        {
            if (property.getAddress().contains(address))
            {
                foundProperties.add(property);
            }
        }
        return foundProperties;
    }

    public String getAddresses()
    {
        String addresses = "";

        for (Cleanable property : properties)
        {
            if (properties.indexOf(property) >= 1)
            {
                addresses += ", " + property.getAddress();
            }
            else
            {
                addresses += property.getAddress();
            }
        }
        return addresses;
    }

}
