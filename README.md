<p align="center">
    <img src="./assets/wave-logo-text-2000.png" height="70px"/>
    <br/><br/>
    <a href="https://codeclimate.com/github/dhsavell/wave/maintainability"><img src="https://api.codeclimate.com/v1/badges/cef270fec0ece8f7bac8/maintainability" /></a>
</p>

# wave

> A Discord bot focused on server administration.

Wave is an advanced administration bot that is easily approachable yet very
powerful. There is currently no official public instance.

## Getting Started

The included Gradle wrapper can be used to build, test, and run the bot. The
code is separated into 3 modules:

- `wave-app` - Contains the features available on the official Wave instance.
- `wave-core` - Core bot framework. 
- `wave-docs` - Documentation generator.

Here are some common tasks, as of the current version:

```sh
# Run an instance of the bot directly from Gradle:
./gradlew wave-app:run --args='--token="<your token>"'

# Run tests for the core framework:
./gradlew wave-core:test

# Build documentation stubs:
./gradlew wave-docs:run --args="<path to docs folder>"
```

### Previewing Docs

Wave's documentation is generated by the `wave-docs` module and powered
by Docsify. You can use your static server of choice to serve the `docs`
folder in the repository. If you want to use Docsify for this, you'll
need `npm` as well:

```sh
npm install -g docsify-cli
docsify serve ./docs
```
