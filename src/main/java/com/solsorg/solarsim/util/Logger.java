package com.solsorg.solarsim.util;

import java.util.List;
import java.util.ArrayList;

public class Logger {
    private static Logger instance;

    private final List<String> errors;
    private final List<String> warnings;
    private final List<String> infos;

    public Logger(){
        this.errors = new ArrayList<>();
        this.warnings = new ArrayList<>();
        this.infos = new ArrayList<>();
    }

    public void logError(String errorMessage){
        System.out.println("[ERROR]" + errorMessage);
        errors.add(errorMessage);
    }

    public void logWarning(String warningMessage){
        System.out.println("[WARNING]" + warningMessage);
        warnings.add(warningMessage);
    }

    public void logInfo(String infoMessage){
        System.out.println("[INFO]" + infoMessage);
        infos.add(infoMessage);
    }

    public static Logger getInstance() {
        return instance;
    }

    public static void setInstance(Logger instance) {
        Logger.instance = instance;
    }

    public List<String> getErrors() {
        return errors;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    public List<String> getInfos() {
        return infos;
    }
}
