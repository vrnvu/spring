package bar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bar {

  @Value("${bar.name}")
  public String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
