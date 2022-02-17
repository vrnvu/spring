package bar;

import config.BarConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@ContextConfiguration(classes = BarConfig.class)
class BarTest {

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