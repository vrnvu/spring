package complex;

import foo.Foo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@ContextConfiguration(classes = ComplexLocalConfigWithMockitoTest.ComplexConfigTestLocalWithMockito.class)
public class ComplexLocalConfigWithMockitoTest {

  // NOTICE THAT WE DO NOT NEED TO SCAN FOO
  @Configuration
  @ComponentScan({"complex"})
  static class ComplexConfigTestLocalWithMockito {

  }

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
