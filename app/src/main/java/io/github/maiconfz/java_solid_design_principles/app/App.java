/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.github.maiconfz.java_solid_design_principles.app;

import io.github.maiconfz.java_solid_design_principles.list.LinkedList;

import static io.github.maiconfz.java_solid_design_principles.utilities.StringUtils.join;
import static io.github.maiconfz.java_solid_design_principles.utilities.StringUtils.split;
import static io.github.maiconfz.java_solid_design_principles.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
