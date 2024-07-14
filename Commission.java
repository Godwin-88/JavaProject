public class Commission {
    private String country;
    private double rate;
    
    public Commission(String country, double rate) {
        this.country = country;
        this.rate = rate;
    }

    // Getters and setters
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}

