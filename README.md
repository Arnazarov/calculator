# Calculator
Simple calculator app using JavaFX.

The app written in MVC architecture and has following classes, files and methods: 
  - Main.java (Main class to run the program)
      - main() method launches the app
      - start() method starts the app (includes anonymous inner class)
  
  - Model.java (Data)
      - calculate() method that performs simple calculations
  
  - Controller.java (Application logic)
      - processNumbers() gets number values from buttons
      - processOperators() gets operator values from buttons
      - clear() method clears the screen 
 
 - View.fxml (User-interface)
 
 How To Use:
 - After cloning this repository, you need to add following lines to VM options in Edit Configurations:
 Windows:
  --module-path
"\path\to\javafx\sdk\lib"
--add-modules
javafx.controls,javafx.fxml

 Mac:
 --module-path
"/path/to/javafx/sdk/lib"
--add-modules
javafx.controls,javafx.fxml
 
 Screenshot:
 ![Image of example1] (https://github.com/Arnazarov/Calculator/blob/master/Screen1.JPG)
 ![Image of example2] (https://github.com/Arnazarov/Calculator/blob/master/Screen2.JPG)
