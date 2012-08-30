

import java.math.BigDecimal;

import models.Blog;
import models.Blog;

import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

public class ModelTest {

	@Test
	public void simpleCheck() {
		int a = 1 + 1;
		assertThat(a).isEqualTo(2);
	}

	@Test
	public void testServices() {
		running(fakeApplication(), new Runnable() {
			public void run() {
			}
		});
	}

}