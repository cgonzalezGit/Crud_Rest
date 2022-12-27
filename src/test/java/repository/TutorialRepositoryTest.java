package repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.app.crud_actuator_test.model.Tutorial;
import com.app.crud_actuator_test.repository.TutorialRepository;


@DataJpaTest
public class TutorialRepositoryTest {
	@Autowired
	private TutorialRepository tutorialRepository;
	
	@DisplayName("Test para guardar un tutorial")
	@Test
	 void guardarTutorial() {
		// Given --> Dado o condicion previa o configuracion
		Tutorial tutorial = new Tutorial();
		tutorial.setTitle("AAAA");
		tutorial.setDescription("EEEEEE");
		tutorial.setPublished(true);
		// when --> Accion o el comportamiento que vamos a probar
		
		Tutorial tutorialGuardado = tutorialRepository.save(tutorial);
//		// then --> Verificar la salida
//				
		assertThat(tutorialGuardado).isNotNull();
		assertThat(tutorialGuardado.getId()).isGreaterThan(0);
		
	}

}
