# archetype

## How to use:

- clone project
- Install archetype using: ```mvn install```
- Apply ```mvn archetype:generate``` like example below to create new feature by this template
- Just click Enter #times on all cmd questions

### Generate template:

```
mvn archetype:generate                           \
  -DarchetypeGroupId=info.smart-tools.common     \
  -DarchetypeArtifactId=feature-archetype        \
  -DarchetypeVersion=0.1.7                       \
  -DgroupId=<feature-groupId>                    \
  -DgroupPackage=<feature_groupId>               \
  -DartifactId=<feature-name>                    \
  -DartifactPackage=<feature_name>               \
  -DrepoId=<repository-id>                       \
  -DrepoUrl=<repository-url>                     \
  -Dversion=<version>
```

### Generate example:

```
mvn archetype:generate                           \
  -DarchetypeGroupId=info.smart-tools.common     \
  -DarchetypeArtifactId=feature-archetype        \
  -DarchetypeVersion=0.1.7                       \
  -DgroupId=info.smart-tools.test-group          \
  -DgroupPackage=info.smart_tools.test_group     \
  -DartifactId=test-feature                      \
  -DartifactPackage=test_feature                 \
  -DrepoId=test-repository-id                    \
  -DrepoUrl=test-repository-url                  \
  -Dversion=0.1.0
```