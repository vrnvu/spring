package complex;

import foo.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Complex {

  final Foo foo;

  @Autowired
  public Complex(Foo foo) {
    this.foo = foo;
  }
}
