### prerequirement

- gradle2.14.1
- jre1.8

### assumption dev env
- atom (NOT IDE version)

### procedure

1. install gradle from plugin
2. type command gradle init --type  java-library
3. make dir tools , driver and libs in project root
4. put jre1.8 and gradle2.14.1 in tools
5. make gradle.properties and set the jre dir
6. type dependency selenium and javadoc encoding type(UTF-8) in build.gradle
7. build java file "gradle -g libs clean build"
