# PINs generator library 

### How to build
```
mvn package
```

### How to run the unit tests
```
mvn test
```


### How to generate the test report 
```
mvn surefire-report:report
# It could be accessed at ./target/site/surefire-report.html
```

### Code sample how to consume the library
```
PINGenerator pinGenerator = PINGeneratorFactory.createPINGenerator();
int pinBatchCount = 1000;
Set<String> result = pinGenerator.GeneratePINs(pinBatchCount);
```