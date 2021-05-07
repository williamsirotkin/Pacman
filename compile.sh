javac -d bin -p $JAVAFX_HOME/lib --add-modules javafx.controls src/cs1302/pacman/imageview/*.java
javac -d bin -cp bin -p $JAVAFX_HOME/lib --add-modules javafx.controls src/cs1302/pacman/hbox/*.java
javac -d bin -cp bin -p $JAVAFX_HOME/lib --add-modules javafx.controls src/cs1302/pacman/*.java
java -cp bin -p $JAVAFX_HOME/lib --add-modules javafx.controls cs1302.pacman.Driver
