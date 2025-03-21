public class Coin
{
    public Coin()
    {
        this.value = null;
        this.year = null
    }

    public Coin(double value)
    {
        this.value = value;
        this.year = null;
    }

    public Coin(double value, int year)
    {
        this.value = value;
        this.year = year;
    }

    public String toString()
    {
        return ":)";
    }
}