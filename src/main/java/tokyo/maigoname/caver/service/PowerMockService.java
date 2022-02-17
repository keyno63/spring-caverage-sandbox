package tokyo.maigoname.caver.service;

import tokyo.maigoname.caver.util.StaticUtils;

public class PowerMockService {
    public String getStringValue(String arg) {
        return String.format("args=[%s], utils=[%s]", arg, StaticUtils.getValue());
    }
}
