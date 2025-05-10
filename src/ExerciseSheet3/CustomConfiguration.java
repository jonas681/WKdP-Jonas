package ExerciseSheet3;

import java.util.List;

public class CustomConfiguration extends Configuration {


    public CustomConfiguration(String appName, List<String> modules) {
        super(appName, modules);
        appName = "Custom Configuration";

    }
   // public final String describe(){
        //return "Custom Configuration Info" + appName+ " " + super.modules;
    }


