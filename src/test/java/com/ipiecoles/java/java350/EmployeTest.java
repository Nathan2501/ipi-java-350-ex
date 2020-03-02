package com.ipiecoles.java.java350;

import com.ipiecoles.java.java350.model.Employe;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeTest {

        @Test //Junit 4 : org.junit.Test, Junit 5 : org.junit.jupiter.api.Test
        public void testGetNbAnneeAncienneteEtEmbauche(){
            Employe employe = new Employe();
            employe.setDateEmbauche(null);

            //When
            Integer nbAnneeAnciente = employe.getNombreAnneeAnciennete();

            boolean test = employe.getNombreAnneeAnciennete().equals(1);

            Assertions.assertThat(test).isFalse();
        }

}
