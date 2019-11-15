package com.bravosystems.pes.test.jenkinsx;

import io.javalin.Javalin;

public class Runner {

  public static void main(String[] args) {
    Javalin app = Javalin.create().start(7000);
    app.get("/", ctx -> ctx.result("Hello Platform"));
  }
}
