all: Color.class Main.class

Color.class: Color.java
	javac Color.java
	
Main.class: Main.java
	javac Main.java
