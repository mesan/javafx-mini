# Installer javafx i lokalt repo med kommanduen under...
mvn install:install-file -Dfile=jfxrt.jar -DgroupId=com.oracle  -DartifactId=javafx -Dpackaging=jar -Dversion=2.2.


# Eksempel: 
C:\Program Files\Java\jdk1.7.0_07\jre\lib>mvn install:install-file -Dfile=jfxrt.jar -DgroupId=com.oracle -DartifactId=javafx -Dpackaging=jar -Dversion=2.2
[INFO] Scanning for projects...
[INFO] Searching repository for plugin with prefix: 'install'.
[INFO] ------------------------------------------------------------------------
[INFO] Building Maven Default Project
[INFO]    task-segment: [install:install-file] (aggregator-style)
[INFO] ------------------------------------------------------------------------
[INFO] [install:install-file {execution: default-cli}]
[INFO] Installing C:\Program Files\Java\jdk1.7.0_07\jre\lib\jfxrt.jar to C:\Users\hallvardb\.m2\repository\com\oracle\javafx\2.2\javafx-2.2.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESSFUL
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2 seconds
[INFO] Finished at: Wed Oct 10 10:31:28 CEST 2012
[INFO] Final Memory: 5M/76M
[INFO] ------------------------------------------------------------------------
C:\Program Files\Java\jdk1.7.0_07\jre\lib>




































