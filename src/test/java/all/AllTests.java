package all;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({
    "bar",
    "complex",
    "foo",
    "fooandbar"
})
public class AllTests {
}
