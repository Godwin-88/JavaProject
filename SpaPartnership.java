public class SpaPartnership {
    private int hotelId;
    private double profitShare;
    
    public SpaPartnership(int hotelId, double profitShare) {
        this.hotelId = hotelId;
        this.profitShare = profitShare;
    }

    // Getters and setters
    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public double getProfitShare() {
        return profitShare;
    }

    public void setProfitShare(double profitShare) {
        this.profitShare = profitShare;
    }
}
