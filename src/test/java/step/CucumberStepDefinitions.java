package step;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import it.beccaria.test.BasicCrudTest;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = it.beccaria.Application.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@ActiveProfiles("test")
public class CucumberStepDefinitions<D> extends BasicCrudTest<D> {
	@Autowired
	protected ApplicationContext context;


	protected void mockES() {


	}
}
