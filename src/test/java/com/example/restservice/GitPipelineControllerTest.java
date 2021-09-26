import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.example.controller.GitPipelineController;

    @RunWith(SpringRunner.class)
    @WebMvcTest(GitPipelineController.class)
    public class GitPipelineControllerTest {

        @Autowired
        private MockMvc mockMvc;

        @Test
        public void testSayHelloWorld() throws Exception {
            this.mockMvc.perform(get("/gitPipeline").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                    .andExpect(status().isOk())
                    .andExpect(content().contentType("application/json"));

        }

    }
