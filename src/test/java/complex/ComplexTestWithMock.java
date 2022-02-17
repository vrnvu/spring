package complex;


import config.ComplexConfig;
import foo.Foo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

// NOTICE THAT WE ARE USING COMPLEX AND FOO PACKAGE, NO NEED... WE ARE WASTING RESOURCES
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@ContextConfiguration(classes = ComplexConfig.class)
public class ComplexTestWithMock {

  @MockBean
  Foo foo;

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
    when(foo.getName()).thenReturn("hello-foo-mock");
    assertThat(complex.getFoo().getName()).isEqualTo("hello-foo-mock");
  }
}
