package com.tms.Homework_15_TMS;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        // email адрес в формате xxx@xxx.xxx (регистр букв игнорируется)
        String regexp = "([0-9_\\--]{4})([a-zA-Z_\\--]{4})\\-([0-9_\\--]{4})([a-zA-Z_\\--]{4})\\-([0-9])([a-zA-z])([0-9])([a-zA-z])$";

        //String test = "tms.andrew.test@gmail.com";
        String test = "3753-FGDS-8765-Ygyg-4R8Y";

        Pattern pattern = Pattern.compile(regexp, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(test);

        System.out.println(matcher.find() ?
                "I found '"+matcher.group()+"' starting at index "+matcher.start()+" and ending at index "+matcher.end()+"." :
                "I found nothing!");
    }

}
