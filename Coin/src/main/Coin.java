public abstract class Coin
{
    double value;
    String commonName;
    String frontMotto;
    int manufactureYear;
    String frontImage;
    String backImage;
    String backMotto;
    String frontLabel;
    String backLabel;
    String valueDescription;
    boolean ridgedEdge;
    String metallurgy;
    
    public Coin(double value, String commonName, String frontMotto,
        int manufactureYear, String frontImage, String backImage, String backMotto,
        String frontLabel, String backLabel, String valueDescription, 
        boolean ridgedEdge, String metallurgy)
    {
        this.value = value;
        this.commonName = commonName;
        this.frontMotto = frontMotto;
        this.manufactureYear = manufactureYear;
        this.frontImage = frontImage;
        this.backImage = backImage;
        this.backMotto = backMotto;
        this.frontLabel = frontLabel;
        this.backLabel = backLabel;
        this.valueDescription = valueDescription;
        this.ridgedEdge = ridgedEdge;
        this.metallurgy = metallurgy;
    }

    public String toString()
    {
        return String.format("Value: %.2f | Common Name: %s | Front Motto: %s | Manufacture Year: %d | Front Image: %s | Back Image: %s | Back Motto: %s | Front Label: %s | Back Label: %s | Value Description: %s | Ridged Edge: %s | Metallurgy: %s", 
            value, commonName, frontMotto, manufactureYear, frontImage, backImage, backMotto, frontLabel, backLabel, valueDescription, ridgedEdge, metallurgy);
    }


    //getters for coin attributes
    double getValue(){
        return this.value;
    }
    String getCommonName(){
        return this.commonName;
    }
    String getFrontMotto(){
        return this.frontMotto;
    }
    int getManufactureYear(){
        return this.manufactureYear;
    }
    String getFrontImage(){
        return this.frontImage;
    }
    String getBackImage(){
        return this.backImage;
    }
    String getBackMotto(){
        return this.backMotto;
    }
    String getFrontLabel(){
        return this.frontLabel;
    }
    String getBackLabel(){
        return this.backLabel;
    }
    String getValueDescription(){
        return this.valueDescription;
    }
    boolean getRidgedEdge(){
        return this.ridgedEdge;
    }
    String getMetallurgy(){
        return this.metallurgy;
    }
}

