![Build](https://github.com/rishabhverma17/Dropiwizard-Template/workflows/Java%20CI%20with%20Gradle/badge.svg?branch=master) [![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fchaysewlkr21%2FDw_Template.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Fchaysewlkr21%2FDw_Template?ref=badge_shield)


# Dropwizard Microservice Template (Gradle)

This is a Dropwizard microservice template. Just fork it and start building over it.

### Features present
- Configuration reading from Environment variable.
- Mongo's DAO layer implemented for demo.
- Demo resource created.
- Spotless applied.

### Needs to be added
- dockerize.gradle before making it into production.

### Requirements to run
- Setup Mongo
    - Create DB demoMongoDB
    - Create Collection employees
- Build command

```bash
./gradlew spotlessApply clean build
```
- Run command

```bash
./gradlew spotlessApply clean run
```


## License
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fchaysewlkr21%2FDw_Template.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2Fchaysewlkr21%2FDw_Template?ref=badge_large)