package hospital;

public class ConfiguracaoHospital {

    private ConfiguracaoHospital() {}
    private static ConfiguracaoHospital instance = new ConfiguracaoHospital();

    public static ConfiguracaoHospital getInstance() {
        return instance;
    }

    private String nomeHospital;
    private String medicoPlantao;

    public String getNomeHospital() {
        return nomeHospital;
    }

    public void setNomeHospital(String nomeHospital) {
        this.nomeHospital = nomeHospital;
    }

    public String getMedicoPlantao() {
        return medicoPlantao;
    }

    public void setMedicoPlantao(String medicoPlantao) {
        this.medicoPlantao = medicoPlantao;
    }
}