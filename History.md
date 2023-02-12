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
