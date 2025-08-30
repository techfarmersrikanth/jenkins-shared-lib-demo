# Jenkins Shared Library Demo

This repo contains a sample Jenkins Shared Library with reusable steps and classes.

## Structure
- vars/ : global functions (hello, deployApp)
- src/ : Groovy classes (MyUtils)

Use in Jenkinsfile:
```groovy
@Library('my-shared-lib') _
hello('World')
deployApp('dev')
```
