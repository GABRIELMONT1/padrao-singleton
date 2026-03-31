package hospital;

public class Main {
    public static void main(String[] args) {

        ConfiguracaoHospital config = ConfiguracaoHospital.getInstance();
        config.setNomeHospital("Hospital Unimed");
        config.setMedicoPlantao("Dr. Rodolfo");

        System.out.println("Hospital: " + ConfiguracaoHospital.getInstance().getNomeHospital());
        System.out.println("Médico de plantão: " + ConfiguracaoHospital.getInstance().getMedicoPlantao());

        System.out.println("Mesma instancia? " + (config == ConfiguracaoHospital.getInstance()));
    }
}
