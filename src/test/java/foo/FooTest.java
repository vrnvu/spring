package foo;

import config.FooConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@ContextConfiguration(classes = FooConfig.class)
class FooTest {

  @Autowired
  Foo foo;

  @Test
  void testsWorking() {
    assertTrue(true);
  }

  @Test
  void fooNotNull() {
    assertThat(foo).isNotNull();
  }

  @Test
  void fooName() {
    assertThat(foo.name).isEqualTo("hello-foo-test");
  }
}