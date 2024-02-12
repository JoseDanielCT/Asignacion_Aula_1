
package edu.pucmm.pw;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! NFL Chiefs Fan");

    {
        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("Hello World"))
                .start(7070);
    }
}
 }
