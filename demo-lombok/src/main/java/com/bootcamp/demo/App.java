package com.bootcamp.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class App {
   
    
    public static void main(String[] args) {
        //! JDK (built-in in java)
        //!1.Auto-import (imported by default)
        String s = "hello"; //eg.java.lang.String
        Math.min(0,0);
        StringBuilder sb = new StringBuilder();
        Math.abs(-17);
        
        //!2. Explicit Import (need manual import)
        BigDecimal bd = BigDecimal.valueOf(10);
        LocalDate ld = LocalDate.of(2015, 10, 30);

        //! Maven (connect internet to world libary)
        //!3. Download External Libary (outside JDK)
          //-> download class
          // copy code from maven
          //paste in pom.xml/ dependencies
          //gitbash: to project file, >mvn clean compile, >mvn clean install
          // in target folder have .jar file -> install success


    }
}
