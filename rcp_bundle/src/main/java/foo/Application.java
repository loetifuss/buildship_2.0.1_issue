package foo;

import groovy.lang.GroovyShell;

public class Application {

	
	public void someMethod() {
		
        GroovyShell interpreter = new GroovyShell();
        interpreter.evaluate("println 'Hello world'");
        
	}
	
	public static void main(String[] args) {
		new Application().someMethod();
	}
	
}
