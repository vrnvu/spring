package complex;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@ContextConfiguration(classes = ComplexLocalConfigTest.ComplexConfigTestLocal.class)
public class ComplexLocalConfigTest {

  @Configuration
  @ComponentScan({"complex", "foo"})
  static class ComplexConfigTestLocal {

  }

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
    assertThat(complex.getFoo().getName()).isEqualTo("hello-foo-test");
  }
}
