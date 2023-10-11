### PersonalJavaProjects

`iPod`: skips and shuffles through songs on an "iPod" array. To remove/add songs, edit songs array in ipod.java file

1. `mvn clean` -- will erase everything from the `target` directory in your project, including any generated `.class` files and `.java` source files generated by `JavaCC`
2. `mvn javacc:javacc` -- runs JavaCC against your lexical specification, automatically creating `.java` files that are placed in the `target/generated-sources/javacc/compilers/` directory. **Whenever you edit/modify the `.jj` file, you need to re-generate the scanner by executing this step.**
3. running the `compilers.Ram23Compiler` driver -- tests your scanner against a single `.ram23` program
4. `mvn
