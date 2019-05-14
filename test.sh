javac OctalToDecimalConverter.java
java OctalToDecimalConverter --base 8 10 > actual
diff actual Expected8
java OctalToDecimalConverter --base 2 100 > actual
diff actual Expectfor2
java OctalToDecimalConverter --base 6 120 > actual
diff actual Expectfor6
java OctalToDecimalConverter --base 5 134 > actual
diff actual Expectfor5





