# serenity_jbehave_framework

Steps to implement:

1. Install Java Jdk 1.8
2. Create maven project with archetype quick start in Intellij
3. Setup Environmental Variables in pc 
    1. user variable - 
    2. Set java jdk path in JAVA_HOME 
    3. set java jdk bin path in 'path' user variable

    4. System variable - 
    5. Set java jdk bin path in JAVA_HOME
    6. Set Java jdk bin path and drivers in JAVA_PATH
    7. Set Maven bin path in MAVEN_HOME 
    8. Set java jdk bin path, apache maven bin path, chrome driver exe path in 'path' system variable

4. Maven Command to run a story file:
mvn verify "-Dmetafilter=groovy: function == 'verify_facebook_url'" -DexecutionThreadCount=1 -DforkCount=0 -f C:\SerenityJbehaveAutomationFramework\pom.xml