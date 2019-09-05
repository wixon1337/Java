public class Location {
    private final String latitude;
    private final String longitutde;

    public Location(String latitude, String longitutde) {
        this.latitude = latitude;
        this.longitutde = longitutde;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitutde() {
        return longitutde;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude='" + latitude + '\'' +
                ", longitutde='" + longitutde + '\'' +
                '}';
    }
}
