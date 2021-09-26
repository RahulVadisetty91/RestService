import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.controller.GitPipelineController;
import com.example.RestServiceApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestServiceApplication.class)
public class SmokeHelloControllerTest {

	@Autowired
	private GitPipelineController gitPipelineController;

	@Test
	public void testApplicationLload() {
		assertNotNull("GitPipelineController is not loaded", gitPipelineController);
	}
}
