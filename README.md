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
The maven plugins are giving you different functionality as goals. Such plugins are the compile package install clean and so on. The plugins can be specified in the pom.xml in the build node with their versions and specific configuration if needed.
As of this repository a specific configuration was added for the complier plugin which gives the compile. As default this plugin is running the compilation with 1.5 version of the jdk. In the configuration of the pom.xml the version is set to 1.8.
The following plugin `dependency` with its operator tree will give all downloaded dependecies with their .jar files for the current project.
```
mvn dependency:tree
```

## Dependencies
There are 6 scopes of the dependencies:
1. Compile - used during compilation and execution. Included in containers
2. Runtime - used in runtime/Deployment
3. Test - used only for tests src/test
4. Provided - from the target or from the applicaiton server
5. System - only localy. Only for license work arounds.
6. Import - replace dependecies from other projects. Almost never used.

## Testing
```
mvn test
```

Tests are run as part of the install goal.