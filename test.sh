javac BaseConverter.java
java BaseConverter --base 8 10 > actual
diff actual ExpectedFor10InBase8
java BaseConverter --base 2 100 > actual
diff actual ExpectFor100InBase2
java BaseConverter --base 6 120 > actual
diff actual ExpectFor120InBase6
java BaseConverter --base 5 134 > actual
diff actual ExpectFor134InBase5
java BaseConverter --base 2 45 > actual
diff actual ExpectInvalidFor45InBase2





