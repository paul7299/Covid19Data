public class Covid19Data {

    private String region;
    private String aldersgruppe;
    private int bekræftedeDøde;
    private int døde;
    private int indlagtePåIntensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int bekræftedeDøde, int døde, int indlagtePåIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeDøde = bekræftedeDøde;
        this.døde = døde;
        this.indlagtePåIntensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "region='" + region + '\'' +
                ", aldersgruppe='" + aldersgruppe + '\'' +
                ", bekræftedeDøde=" + bekræftedeDøde +
                ", døde=" + døde +
                ", indlagtePåIntensiv=" + indlagtePåIntensiv +
                ", indlagte=" + indlagte +
                ", dato='" + dato + '\'' +
                "}\n";
    }
}
