package tokyo.maigoname.caver.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tokyo.maigoname.caver.util.Utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SampleServiceTest {

    @Mock
    private Utils utilsMock;

    @InjectMocks
    private SampleService target;

    @Test
    void test1() {
        when(utilsMock.getValue()).thenReturn("mocked value");
        final String actual = target.getStringValue("value1");
        assertThat(actual).isEqualTo("args=[value1], utils=[mocked value]");
    }

}