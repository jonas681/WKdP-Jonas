package ExerciseSheet3;

import java.util.List;

public class Configuration {

    private final String appName;
    private final List<String> modules;
    public Configuration(String appName, List<String> modules) {
        this.appName = appName;
        this.modules = modules;
    }
    public final String describe(){
        return "Configuration Info" + appName + " " + modules;
    }


}
