javac BaseConverter.java
java BaseConverter --base 8 10 > actual
diff actual Expected8
java BaseConverter --base 2 100 > actual
diff actual Expectfor2
java BaseConverter --base 6 120 > actual
diff actual Expectfor6
java BaseConverter --base 5 134 > actual
diff actual Expectfor5





