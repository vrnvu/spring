package complex;

import config.ComplexConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@ContextConfiguration(classes = ComplexConfig.class)
public class ComplexTest {

  @Autowired
  Complex complex;

  @Test
  void testsWorking() {
    assertTrue(true);
  }

  @Test
  void fooNotNull() {
    assertThat(complex).isNotNull();
  }

  @Test
  void fooName() {
    assertThat(complex.foo.name).isEqualTo("hello-foo-test");
  }
}

