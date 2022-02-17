package bar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@ContextConfiguration(classes = BarLocalConfigTest.BarConfigTest.class)
class BarLocalConfigTest {

  @Configuration
  @ComponentScan("bar")
  static class BarConfigTest {

  }

  @Autowired
  Bar bar;

  @Test
  void testsWorking() {
    assertTrue(true);
  }

  @Test
  void fooNotNull() {
    assertThat(bar).isNotNull();
  }

  @Test
  void fooName() {
    assertThat(bar.name).isEqualTo("hello-bar-test");
  }
}