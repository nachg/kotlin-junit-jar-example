This is an example about how to build a fat jar with *test* source set and run tests from the command line via JUnit 5.
Checkout to the ``testng`` branch to see the same for the TestNg.

1. Execute *jar* task
2. Run command: ``java -cp build/libs/HellowWorld-1.0-SNAPSHOT.jar org.junit.platform.console.ConsoleLauncher -c MainKtTest``