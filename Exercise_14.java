package SorteOpgaver.ch11.aske1208_a_11_14;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;

public class fourteen
{
    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2)
    {
        Map<String, Integer> mapToBeReturned = new HashMap<>();

        try {
            for (Map.Entry<String, Integer> m1: map1.entrySet())
            {
                for (Map.Entry<String, Integer> m2: map2.entrySet())
                {
                    if (m1.getKey() == m2.getKey())
                    {
                        if (m1.getValue() == m2.getValue())
                        {
                            mapToBeReturned.put(m1.getKey(), m1.getValue());
                        }
                    }
                }
            }


        }catch (ConcurrentModificationException CMe)
        {

        }
        return mapToBeReturned;
    }
}
