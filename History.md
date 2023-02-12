# What happened when (some kind of a Changelist)

## Create the first maven project

```
mvn archetype:generate -DgroupId=com.mihnita -DartifactId=testapp -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

## Convert the simple project into a multi-module one

Nothing interesting yet.

Adding module1, module2, module3, create a parent pom.xml to build it all, format stuff as I like it.

Unit tests show messages, colored to see what happens, with "SPY" so that we can grep.

## Created a GitHub action & added a `workflow_dispatch`

Run (interactive) with:
```
gh workflow run
```

## Added various Test and IT classes

Notice that the integration tests don't run, even when we invoke `mvn -q verify`.

## Added maven-failsafe-plugin to pluginManagement

The integration tests still don't run.
Adding something to pluginManagement does not mean is it also used.
Try `mvn -q verify` or `mvn -q integration-test`

## Added maven-failsafe-plugin to build / plugins, module2 only

Now the integration tests work for module2, but not for module3

## Moved the build / plugins / maven-failsafe-plugin to root

Now the integration tests work for both module2 and module3

## Experimenting with BOM (Bill of Materials) - dependency

See https://reflectoring.io/maven-bom/

There are two main ways to do it:
- as a parent POM
- as a dependency

Will try first as a dependency.

Notes:
```
mvn dependency:analyze-report
```
Warns that `"Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!"`

And
```
mvn versions:display-plugin-updates
```
Warns that `"The following plugins do not have their version specified"`

This seems to indicate that not everything declared in the bom ends up propagating to the other modules.  
Like the encooding (in properties) and the plugin versions.

## Experimenting with BOM (Bill of Materials) - as a parent POM

Both:
```
mvn dependency:analyze-report
```
and
```
mvn versions:display-plugin-updates
```
have a lot fewer warnings.

In fact the only one is `"Project does not define required minimum version of Maven"`
which is not connected to the whole BOM experiment.
