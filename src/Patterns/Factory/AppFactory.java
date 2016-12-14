/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.Factory;

/**
 *
 * @author YNZ
 */
public class AppFactory {

    public static App getAppInstance(String fileExt) {
        App app = null;

        if (fileExt.equals("doc")) {
            app = (App) new WordProcessor();
        }

        if (fileExt.equals("txt")) {
            app = (App) new TextEditor();
        }
        return app;

    }
}
