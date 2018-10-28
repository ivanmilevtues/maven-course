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
