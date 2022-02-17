package fooandbar;

import bar.Bar;
import config.BarConfig;
import config.FooConfig;
import foo.Foo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@ContextConfiguration(classes = {FooAndBarTestLocalConfig.FooAndBarConfigTest.class})
class FooAndBarTestLocalConfig {


  @Configuration
  @ComponentScan({"foo", "bar"})
  static class FooAndBarConfigTest {

  }

  @Autowired
  Foo foo;

  @Autowired
  Bar bar;

  @Test
  void testsWorking() {
    assertTrue(true);
  }

  @Test
  void fooNotNull() {
    assertThat(foo).isNotNull();
    assertThat(bar).isNotNull();
  }

  @Test
  void fooName() {
    assertThat(foo.name).isEqualTo("hello-foo-test");
    assertThat(bar.name).isEqualTo("hello-bar-test");
  }
}