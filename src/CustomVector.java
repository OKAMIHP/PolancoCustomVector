public class CustomVector
{
    private int[] elements;

    public CustomVector()
    {
        elements = new int[0];
    }

    private void resize(int amount)
    {
        int[] newArray = new int[elements.length + amount];
        for (int i = 0; i < elements.length; i++)
        {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    public void add(int value)
    {
        this.resize(1);
        elements[elements.length - 1] = value;
    }

    public void addAll(int[] values)
    {
        this.resize(values.length);
        for (int i = 0; i < values.length; i++)
        {
            elements[elements.length - values.length + i] = values[i];
        }
    }

    public void insert(int index, int value) {
        this.resize(1);
        for (int i = elements.length - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = value;
    }

    public void remove(int index)
    {
        int[] smallerArray = new int[elements.length - 1];
        int sai = 0;
        for (int i = 0; i < elements.length; i++) {
            if (i != index)
            {
                smallerArray[sai] = elements[i];
                sai++;
            }
        }
        elements = smallerArray;
    }

    public int size()
    {
        return elements.length;
    }

    public int find(int value)
    {
        for (int i = 0; i < elements.length; i++)
        {
            if (elements[i] == value)
            {
                return i;
            }
        }
        return -1;
    }

    public String toString()
    {
        String retStr = "[";
        if (elements != null)
        {
            for (int i = 0; i < elements.length; i++)
            {
                retStr += elements[i];
                if (i < elements.length - 1)
                {
                    retStr += ", ";
                }
            }
            retStr += "]";
            return retStr;
        }
        return "";
    }
}