javac OctalToDecimalConverter.java
java OctalToDecimalConverter 10 > actual
diff actual ExpectedOutput
java OctalToDecimalConverter 0 > actual
diff actual Expect
java OctalToDecimalConverter 9 > actual
diff actual Expected
java OctalToDecimalConverter 01 > actual
diff actual Expected1





