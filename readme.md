This is an example about how to build a fat jar with *test* source set and run tests from  the command line.

1. Execute *jar* task
2. Run command: ``java -cp build/libs/HellowWorld-1.0-SNAPSHOT.jar org.junit.platform.console.ConsoleLauncher -c MainKtTest``