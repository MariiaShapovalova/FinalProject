package suits;

import loginTest.InvalidLoginDataFromExel;
import loginTest.InvalidLoginThisParam;
import loginTest.ValidLoginDataFromExel;
import loginTest.ValidTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

@RunWith(Suite.class)
    @Suite.SuiteClasses(
            {
                    ValidTest.class,
                    InvalidLoginThisParam.class,
                    ValidLoginDataFromExel.class,
                    InvalidLoginDataFromExel.class
            }
    )
public class suitLogin {

}
