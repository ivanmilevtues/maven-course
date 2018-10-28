# Maven course

- Goal = task

## JAR Lifecycle: 
1. compile - compiles the code
2. test
3. package - compiles the code and also puts the jar file in the target dir.
4. install - compiles and packages the project also puts the package in the m2 dir so it can be referenced from other projects
5. deploy

--------
- Maven uses default directories to compile such as `prjName/src/main/java`, `prjName/src/main/resource` same for the `prjeName\src\test\<java/resource>`

## Maven Plugins