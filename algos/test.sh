javac -cp .:junit-4.12.jar StudentTest.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore StudentTest

javac -cp .:junit-4.12.jar FactorialTest.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore FactorialTest

javac -cp .:junit-4.12.jar BlackJackTest.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore BlackJackTest
