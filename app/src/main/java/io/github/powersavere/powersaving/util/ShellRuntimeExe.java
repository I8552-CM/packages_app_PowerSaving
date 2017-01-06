package io.github.powersavere.powersaving.util;

import android.util.Log;

import java.io.IOException;

/**
 * Created by sumit on 6/1/17.
 */

public class ShellRuntimeExe {
    public static String Tag="ShellRuntimeExe";
    public static void RunCommand(String command,String ErrorMessage){

        try {
            Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            Log.e(Tag,ErrorMessage);
            e.printStackTrace();
        }
    }
}
