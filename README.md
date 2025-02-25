# Explicit Architecture

> [!TIP]
> Want to chat live with me? Join me on [Discord server](https://discord.gg/EBXRXPRD).

Explicit Architecture is a Kotlin Multiplatform library that makes it easier to structure a
project by following the principles and concepts of DDD.

Get started with
our [📚 installation guide](#installation)
and [example project](#example),

Table of contents
=================

<!--ts-->

* [Layers](#layers)
* [Features](#features)
* [Releases](#releases)
* [Installation](#installation)
* [Example](#example)

<!--te-->

## Layers

**Domain**: The domain layer contains the business logic of the application. It is the heart of the
application and contains the aggregate roots, entities, value objects, repositories and domain
events.

**Application**: The application layer contains the application services and use cases that
orchestrate the domain objects to perform the business logic. It is the entry point to the domain
layer.

**Infrastructure**: The infrastructure layer contains the implementations of the repositories and
other services that interact with frameworks. It is the driven part of the architecture.

**Presentation**: The presentation layer contains the components the users interact with to use the
application. It is the driving part of the architecture.

**Framework**: The framework layer contains the implementations of the external frameworks and tools
used in the application.

## Features

The library provides a set of interfaces and classes to structure a project following the
principles.
Extend your classes to make your code more explicit and easier to understand.

The library offers an event bus solution to decouple the components of the application. Built on top
of coroutines, it allows you to publish and subscribe to events in a simple and efficient way.

## Releases

* The [changelog](CHANGELOG.md) provides a summary of changes in each release.

## Installation

Add `explicitarchitecture` to your `build.gradle` dependencies.

```
dependencies {
    implementation 'io.github.giovanniandreuzza:explicitarchitecture:1.2.1'
}
```

### Example

The [Nimbus Project](https://github.com/giovanniandreuzza/nimbus) demonstrates how to integrate and
use ExplicitArchitecture in a project.