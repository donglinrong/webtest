package test.moduleTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.TestConfig;
import test.impl.Dessert;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class comtest {
    @Autowired
    @Qualifier("cold")
    private Dessert dessert;

    @Test
    public void deShouldNotBeNull()
    {
        dessert.eat();
        assertNotNull(dessert);
    }
}
