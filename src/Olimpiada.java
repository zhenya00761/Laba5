public class Olimpiada {

    private int school;
    private int city;
    private int region;

    public Olimpiada(int school, int city, int region){
        this.school = school;
        this.city = city;
        this.region = region;
    }

    public int getSchool() {
        return school;
    }

    public int getCity() {
        return city;
    }

    public int getRegion() {
        return region;
    }

    public void setSchool(int school) {
        this.school = school;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public boolean condition(){
        if (region != 0 || school == 1 || (city < 4 && city > 0)){
            return true;
        }
        return false;
    }
}
