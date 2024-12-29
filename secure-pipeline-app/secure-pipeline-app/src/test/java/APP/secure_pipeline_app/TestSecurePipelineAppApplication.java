package APP.secure_pipeline_app;

import org.springframework.boot.SpringApplication;

public class TestSecurePipelineAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(SecurePipelineAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
