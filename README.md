# scotland-yard

First year project at the University of Bristol, done in collaboration with Errol Lee. This project aims at implementing the game logic behind the board game Scotland Yard: https://en.wikipedia.org/wiki/Scotland_Yard_(board_game)

Files worked on are found in [src/main/java/uk/ac/bris/cs/scotlandyard/model](https://github.com/marco-lewis/scotland-yard-reupload/tree/master/src/main/java/uk/ac/bris/cs/scotlandyard/model)

# Testing/Running the Program

The program is written in Java and also built and tested using Maven.

Ensure that the latest Java JDK is installed and that the environment variable JAVA_HOME is set to it.

To set up Maven, download and unzip the latest version here: https://maven.apache.org/download.cgi.

I suggest using this guide for downloading Maven on Windows: https://www.mkyong.com/maven/how-to-install-maven-in-windows/. Note that in step 4, you may need to change %M2_HOME%bin to C:\Program Files\apache-maven-3.x.y\bin (or the relative file path) in the PATH variable.

When in command line in the main project directory type the following for the desired outcome:

Compile: `mvn clean compile`

Test: `mvn clean test`

Execute: `mvn clean compile exec:java`
