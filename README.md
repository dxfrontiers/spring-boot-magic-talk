# Spring Boot AutoConfiguration Examples
> This repository contains the code multiple spring boot auto configuration talks held at:
> * [Entwicklertag Frankfurt 2020, Die Magie verstehen: Spring Boot Autokonfigurationen und Starter selbst erstellen](https://entwicklertag.de/frankfurt/2020/die-magie-verstehen-spring-boot-autokonfigurationen-und-starter-selbst-erstellen-level-beginner)
> * [JAX 2020, Die Magie verstehen: Spring Boot Autokonfigurationen und Starter selbst erstellen](https://jax.de/serverside-enterprise-java/die-magie-verstehen-spring-boot-autokonfigurationen-und-starter-selbst-erstellen/)
> * [JAX 2021, Die Magie getestet: AutoConfigurations effektiv testen](https://jax.de/core-java-jvm-languages/die-magie-getestet-autoconfigurations-effektiv-testen/)
> 
> In addition, some of the code was part of a article series found in the JavaMagazin:
> * [9.2020](https://kiosk.entwickler.de/java-magazin/java-magazin-9-2020/), [Spring Boot: Die Magie verstehen - Teil 1
](https://kiosk.entwickler.de/java-magazin/java-magazin-9-2020/auto-configuration-begreifen-und-erstellen/) ([Blog Post](https://jax.de/blog/spring-boot-auto-configuration/))
> * [10.2020](https://kiosk.entwickler.de/java-magazin/java-magazin-10-2020/), [Spring Boot: Die Magie verstehen - Teil 2](https://kiosk.entwickler.de/java-magazin/java-magazin-10-2020/externalized-configuration/)
> ([Blog Post](https://jax.de/blog/spring-boot-konfiguration-leicht-gemacht/))


## Structure

The repository contains a maven multi-module project, with the following modules:

Module | Description
----------|------------
`spring-factories-exploration` | Explores the `SpringFactoriesLoader` in conjunction with the spring boot autoconfiguration concept
`spring-environment-exploration` | Explores the `Environment` and `ConfigurableEnvironment` and its importance in the spring property resolution mechanism
`util` | Some generic utilities used throughout the codebase. These are solely used to make examples easier to read, or provide a nicer console output.
`example` | Contains the example application, that has been enriched using spring boot autoconfiguration. This module depends on the `mina` module
`mina` | This is a meta-module that itself has two submodules: `mina-autoconfigure` and `mina-sshd-spring-boot-starter`.

------
Do you have any questions or suggestions? Get in touch with us:

![digital frontiers](doc/img/logo_250x75.png)

:globe_with_meridians: [https://www.digitalfrontiers.de](https://www.digitalfrontiers.de) \
:email: info@digitalfrontiers.de \
Twitter [@dxfrontiers](https://twitter.com/dxfrontiers)


