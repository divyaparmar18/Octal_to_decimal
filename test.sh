javac OctalToDecimalConverter.java
java OctalToDecimalConverter 10 > actual
diff actual ExpectedOutput
java OctalToDecimalConverter 0 > actual
diff actual Expectfor0
java OctalToDecimalConverter 9 > actual
diff actual Expectfor9
java OctalToDecimalConverter 01 > actual
diff actual Expectfor01





