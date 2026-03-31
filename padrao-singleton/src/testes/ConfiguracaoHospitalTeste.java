package hospital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class ConfiguracaoHospitalTeste {

    @Test
    void deveRetornarNomeHospital() {
        ConfiguracaoHospital.getInstance().setNomeHospital("Hospital Unimed");
        assertEquals("Hospital Unimed", ConfiguracaoHospital.getInstance().getNomeHospital());
    }

    @Test
    void deveRetornarMedicoPlantao() {
        ConfiguracaoHospital.getInstance().setMedicoPlantao("Dr. Rodolfo");
        assertEquals("Dr. Rodolfo", ConfiguracaoHospital.getInstance().getMedicoPlantao());
    }

    @Test
    void deveRetornarMesmaInstancia() {
        ConfiguracaoHospital instancia1 = ConfiguracaoHospital.getInstance();
        ConfiguracaoHospital instancia2 = ConfiguracaoHospital.getInstance();
        assertSame(instancia1, instancia2);
    }
}