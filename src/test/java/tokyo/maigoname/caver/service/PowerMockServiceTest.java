package tokyo.maigoname.caver.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import tokyo.maigoname.caver.util.StaticUtils;

@RunWith(PowerMockRunner.class)
@PrepareForTest({PowerMockService.class, StaticUtils.class})
public class PowerMockServiceTest {

    private final PowerMockService target;

    public PowerMockServiceTest() {
        this.target = new PowerMockService();
    }

    @Test
    public void test1() {
        PowerMockito.mockStatic(StaticUtils.class);
        PowerMockito
                .when(StaticUtils.getValue())
                .thenReturn("mocked value");

        final String actual = target.getStringValue("test value");
        assertThat(actual).isEqualTo("args=[test value], utils=[mocked value]");
    }
}