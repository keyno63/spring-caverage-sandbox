package tokyo.maigoname.caver.service;

import tokyo.maigoname.caver.util.Utils;

public class SampleService {
    private final Utils utils;

    public SampleService(Utils utils) {
        this.utils = utils;
    }

    public String getStringValue(String arg) {
        return String.format("args=[%s], utils=[%s]", arg, utils.getValue());
    }
}
