package demoapp.jeetendra.models;

public class ModelBike {

    private int choosebike;
    private String bikename;

    public String getBikename() {
        return bikename;
    }

    public void setBikename(String bikename) {
        this.bikename = bikename;
    }

    public ModelBike(int choosebike, String bikename) {
        this.choosebike = choosebike;
        this.bikename = bikename;
    }

    public int getChoosebike() {
        return choosebike;
    }

    public void setChoosebike(int choosebike) {
        this.choosebike = choosebike;
    }
}
