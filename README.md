# Task 1
Steps to download
1. Download .zip of this branch to computer
2. Unzip this acrhive

Steps to compile 
1. Open PowerShell in root directory - `leverx_task1`
2. Write command to compile Hello.java  - ` javac -d bin src/main/task1/Hello.java`
3. Check the compiled file Hello.class - `java -cp ./bin/ main.task1.Hello`

Steps to create .jar file
1. Go to bin package - `cd bin`
2. Create executable .jar file  - `jar cfe hello.jar main.task1.Hello main/task1/Hello.class`
3. Start this .jar file - `java -jar hello.jar`
4. Check the result
