# Kover Issue?

The Kover documentation contains the following:

_By default, for the task koverVerify coverage is calculated only for the tests of the one project. If classes or functions are called from tests of another module, then you need to set a flag runAllTestsForProjectTask for KoverExtension to true (see)._

_**In this case, `if verification rules are added`, then running tasks koverVerify or check will trigger the execution of all active tests from all projects!**_

The project configured with:
```
kover {
    runAllTestsForProjectTask = true
}
tasks.koverVerify {
    // No rules added
}
```

The expected behavior would be:
* `gradlew proj1:check` run only that subproject tests: `proj1:test`
* `gradlew proj1:koverReport` run all tests in all projects: `proj1:test, proj2:test`


